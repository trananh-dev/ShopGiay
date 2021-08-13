package DemoBanHang.User.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import DemoBanHang.Dto.CartDto;
import DemoBanHang.Service.AdminImpl.CartServiceImpl;

@Controller
public class CartController {

	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();

	@RequestMapping(value = "AddCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.AddCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuan(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));

		return "redirect:" + request.getHeader("Referer");
	}
	@RequestMapping(value = "AddCartQuanty/{id}")
	public String addCartQuanty(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		int quanty=Integer.parseInt(request.getParameter("quantity"));
		cart = cartService.AddCartQuanty(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuan(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));

		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cartService.DeleteCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuan(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "EditCart/{id}")
	public String EditCart(HttpServletRequest request, HttpSession session, @PathVariable int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		int quanty=Integer.parseInt(request.getParameter("quantity"));
		cart = cartService.EditCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuantyCart", cartService.TotalQuan(cart));
		session.setAttribute("TotalPriceCart", cartService.TotalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	

}
