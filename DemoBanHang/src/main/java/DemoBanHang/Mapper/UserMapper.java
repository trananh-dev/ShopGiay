package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.User;

public class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("ID"));
			user.setName(rs.getString("name"));
			user.setAdd(rs.getString("address"));
			user.setCity(rs.getString("city"));
			user.setPhone(rs.getString("phone"));
			user.setEmail(rs.getString("email"));
			user.setPass(rs.getString("password"));
			
			return user;
			
		}

}
