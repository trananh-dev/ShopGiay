package DemoBanHang.Service.Admin;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.Dto.CartDto;

@Service
public interface ICartService {
	@Autowired
	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart);
	public HashMap<Integer, CartDto> AddCartQuanty(int id,int qty, HashMap<Integer, CartDto> cart);
	public HashMap<Integer, CartDto> EditCart(int id, int qty, HashMap<Integer, CartDto> cart);

	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart);
	public int TotalQuan(HashMap<Integer, CartDto> cart);
	public int TotalPrice(HashMap<Integer, CartDto> cart);

}
