package DemoBanHang.Service.Admin;

import java.util.List;

import org.springframework.stereotype.Service;

import DemoBanHang.Entity.Order;
@Service
public interface IOrderService {
	public void add(Order or);
	public List<Order> getOrderById(int id);
	public List<Order> getDataOrder();

}
