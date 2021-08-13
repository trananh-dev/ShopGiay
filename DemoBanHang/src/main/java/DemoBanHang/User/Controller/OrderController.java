package DemoBanHang.User.Controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Dto.CartDto;
import DemoBanHang.Entity.User;
import DemoBanHang.Service.AdminImpl.OrderServiceImpl;
import DemoBanHang.Service.AdminImpl.ProductServiceImpl;
import DemoBanHang.Service.AdminImpl.UserServiceImpl;
import DemoBanHang.Service.User.HomeServiceImpl;

@Controller
public class OrderController {
	@Autowired
	HomeServiceImpl HomeService;
	@Autowired
	private UserServiceImpl userService;
	@Autowired
	private ProductServiceImpl productService;
	@Autowired
	private OrderServiceImpl orderService;

	@RequestMapping(value = { "thanh-toan" })
	public ModelAndView ThanhToan(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getListProduct());
		mv.setViewName("user/payment");
		return mv;

	}

	@RequestMapping(value = { "checkUser" })
	public String ChekUser(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		User set = (User) session.getAttribute("LoginInfo");

		if (set != null) {
			return "redirect:/thanh-toan";

		} else {
			return "redirect:/dang-ki";

		}

	}

	@RequestMapping(value = { "dat-hang" })
	public ModelAndView Order(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getListProduct());
		User user = (User) session.getAttribute("LoginInfo");

		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("Cart");

		if (cart != null && user != null) {
			DemoBanHang.Entity.Order order = new DemoBanHang.Entity.Order();
			for (Entry<Integer, CartDto> item : cart.entrySet()) {
				order.setId_product(item.getValue().getProduct().getId());
				order.setpName(item.getValue().getProduct().getName());
				order.setCount(item.getValue().getQuanty());
				order.setPrice(item.getValue().getTotalPrice());
				order.setImg(item.getValue().getProduct().getImg());
				order.setId_user(user.getId());
				order.setStatus(0);
				orderService.add(order);
			}

		}

		mv.setViewName("user/success");
		session.removeAttribute("Cart");
		
		return mv;

	}
	@RequestMapping(value = { "order-detail/{id}" })
	public ModelAndView orderdetail(@PathVariable int id,HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getListProduct());
		mv.addObject("order", orderService.getOrderById(id));
		mv.setViewName("user/orderdetail");
		return mv;

	}
	
	@RequestMapping(value = { "quan-tri/list-order" })
	public ModelAndView listorder(HttpServletRequest request, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getListProduct());
		mv.addObject("order", orderService.getDataOrder());
		mv.setViewName("admin/listorder");
		return mv;

	}

}
