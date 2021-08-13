package DemoBanHang.DAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DemoBanHang.Dto.CartDto;
import DemoBanHang.Dto.ProductDto;

@Repository
public class CartDao {
	@Autowired
	ProductDao productDao = new ProductDao();

	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {

		CartDto itemCart = new CartDto();
		ProductDto product = productDao.GetProductById(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + 1);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(product.getPrice());
		}
		cart.put(id, itemCart);

		return cart;
	}

	public HashMap<Integer, CartDto> AddCartQuanty(int id,int qty, HashMap<Integer, CartDto> cart) {

		CartDto itemCart = new CartDto();
		ProductDto product = productDao.GetProductById(id);
		if (product != null && cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(qty);
			itemCart.setTotalPrice(itemCart.getQuanty() * itemCart.getProduct().getPrice());
		} else {
			itemCart.setProduct(product);
			itemCart.setQuanty(qty);
			itemCart.setTotalPrice(product.getPrice()*itemCart.getQuanty());
		}
		cart.put(id, itemCart);

		return cart;
	}

	public HashMap<Integer, CartDto> EditCart(int id, int qty, HashMap<Integer, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();
		if (cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQuanty(qty);
			itemCart.setTotalPrice(qty * itemCart.getProduct().getPrice());
		}

		cart.put(id, itemCart);

		return cart;
	}

	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}

		return cart;
	}

	public int TotalQuan(HashMap<Integer, CartDto> cart) {
		int totalQuanty = 0;
		for (Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}

	public int TotalPrice(HashMap<Integer, CartDto> cart) {
		int totalPrice = 0;
		for (Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}

}
