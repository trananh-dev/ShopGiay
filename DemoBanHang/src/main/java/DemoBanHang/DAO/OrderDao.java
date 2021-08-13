package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Dto.ProductDto;
import DemoBanHang.Entity.Order;
import DemoBanHang.Mapper.OrderMapper;
import DemoBanHang.Mapper.ProductMapper;

@Repository
public class OrderDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public void add(Order or) {
		String SQL = "INSERT INTO tbl_order (PID,PName,soluong,price,image,customer_id,status) VALUES ( ?,?,?,?,?,?,?)";
		_jdbcTemplate.update(SQL, or.getId_product(),or.getpName(),or.getCount(),or.getPrice(),or.getImg(),or.getId_user(),or.getStatus());
	}
	public List<Order> getOrderById(int id) {
		List<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM tbl_order where customer_id ="+id+"";
		list = _jdbcTemplate.query(sql, new OrderMapper());
		return list;
	}
	public List<Order> getDataOrder() {
		List<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM tbl_order";
		list = _jdbcTemplate.query(sql, new OrderMapper());
		return list;
	}

}
