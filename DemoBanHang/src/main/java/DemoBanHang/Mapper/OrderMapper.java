package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.Order;

public class OrderMapper implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Order or =new Order();
		 or.setId(rs.getInt("ID"));;
		 or.setId_product(rs.getInt("PID"));
		 or.setpName(rs.getString("PName"));
		 or.setCount(rs.getInt("soluong"));
		 or.setPrice(rs.getInt("price"));
		 or.setImg(rs.getString("image"));
		 or.setId_user(rs.getInt("customer_id"));
		 or.setStatus(rs.getInt("status"));
		 or.setDate(rs.getString("date_order"));
		 
		return or; 
	}
	

}
