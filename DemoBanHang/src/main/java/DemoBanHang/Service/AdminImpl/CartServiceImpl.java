package DemoBanHang.Service.AdminImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.CartDao;
import DemoBanHang.Dto.CartDto;
import DemoBanHang.Service.Admin.ICartService;

@Service
public class CartServiceImpl implements ICartService {
	@Autowired
	private CartDao cartDao = new CartDao();

	@Override
	public HashMap<Integer, CartDto> AddCart(int id,  HashMap<Integer, CartDto> cart) {

		return cartDao.AddCart(id,  cart);
	}

	@Override
	public HashMap<Integer, CartDto> EditCart(int id, int qty, HashMap<Integer, CartDto> cart) {
		return cartDao.EditCart(id, qty, cart);
	}

	@Override
	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		return cartDao.DeleteCart(id, cart);
	}

	@Override
	public int TotalQuan(HashMap<Integer, CartDto> cart) {
		return cartDao.TotalQuan(cart);
	}

	@Override
	public int TotalPrice(HashMap<Integer, CartDto> cart) {
		return cartDao.TotalPrice(cart);
	}

	@Override
	public HashMap<Integer, CartDto> AddCartQuanty(int id, int qty, HashMap<Integer, CartDto> cart) {
		return cartDao.AddCartQuanty(id, qty, cart);
	}

}
