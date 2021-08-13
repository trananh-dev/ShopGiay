package DemoBanHang.User.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Entity.Admin;
import DemoBanHang.Entity.Category;
import DemoBanHang.Entity.User;
import DemoBanHang.Service.AdminImpl.ProductServiceImpl;
import DemoBanHang.Service.AdminImpl.UserServiceImpl;
import DemoBanHang.Service.User.HomeServiceImpl;

@Controller
public class UserController {

	@Autowired
	HomeServiceImpl HomeService;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private ProductServiceImpl productService;

	@RequestMapping(value = "/dang-ki", method = RequestMethod.GET)
	public ModelAndView dangki() {
		ModelAndView mv = new ModelAndView("user/register");
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("user", new User());

		return mv;
	}

	@RequestMapping(value = "/dang-ki", method = RequestMethod.POST)
	public ModelAndView taotk(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		int count = userService.AddUser(user);
		if (count > 0) {
			mv.addObject("tb", "Đăng kí tài khoản thành công");
		} else {
			mv.addObject("tb", "Đăng kí tài khoản thất bại");
		}
		mv.setViewName("user/register");

		return mv;
	}
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView dangnhap() {
		ModelAndView mv = new ModelAndView("user/register");
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("user", new User());
		

		return mv;
	}

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public ModelAndView dangnhap(HttpSession session, @ModelAttribute("users") User user) {
		ModelAndView mv = new ModelAndView();
		
			user = userService.CheckAccount(user);
		if (user != null) {
			mv.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", user);
		} else {
			mv.setViewName("redirect:dang-nhap");
			mv.addObject("tblogin", "Đăng nhập thất bại");
			
		}

		return mv;
	}

	@RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
	public String dangxuat(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
	public ModelAndView giohang() {
		ModelAndView mv = new ModelAndView("user/cart");
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getListProduct());
		mv.addObject("user", new User());

		return mv;
	}

	@RequestMapping("/User/{id}")
	public ModelAndView viewUser(@PathVariable int id, Model model) {
		ModelAndView mv = new ModelAndView();
		User user = userService.findById(id);
		model.addAttribute("user1", user);
		mv.setViewName("user/editUser");
		return mv;
	}

	@RequestMapping(value = "/EditUser/{id}")
	public ModelAndView doUpdateCustomer(@PathVariable int id, @ModelAttribute("user1") User user, Model model) {
		ModelAndView mv = new ModelAndView();
		userService.Update(user);

		mv.addObject("LoginInfo", userService.findById(id));
		mv.setViewName("user/payment");
		return mv;

	}

	@RequestMapping(value = { "/quan-tri" }, method = RequestMethod.GET)
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView("templates/login");
		mv.addObject("admin", new Admin());
		return mv;
	}

}
