package DemoBanHang.Service.AdminImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.OrderDao;
import DemoBanHang.Entity.Order;
import DemoBanHang.Service.Admin.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	@Autowired
	private OrderDao orderDao;

	@Override
	public void add(Order or) {
		
		orderDao.add(or);
		
	}

	@Override
	public List<Order> getOrderById(int id) {
		return orderDao.getOrderById(id);
	}

	@Override
	public List<Order> getDataOrder() {
		
		return orderDao.getDataOrder();
	}

}
