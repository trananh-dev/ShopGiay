package DemoBanHang.Admin.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Entity.Admin;
import DemoBanHang.Service.AdminImpl.AdminServiceImpl;

@Controller
@RequestMapping(value = "/quan-tri")
public class AdminController {
	@Autowired
	private AdminServiceImpl adminService;


	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/index");

		return mv;
	}

	@RequestMapping(value = { "/loginAdmin" } )
	public ModelAndView loginAdmin(HttpServletRequest request,HttpSession session, @ModelAttribute("admin") Admin ad) {
		ModelAndView mv = new ModelAndView();
		ad = adminService.CheckAccount(ad);
		if (ad != null) {
			session.setAttribute("Admin", ad);
			mv.setViewName("redirect:home");
		} else {
			mv.setViewName("redirect:" + request.getHeader("Referer"));
			mv.addObject("tblogin", "Đăng nhập thất bại");
		}

		return mv;
	}

}
