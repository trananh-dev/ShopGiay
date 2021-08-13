package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.Admin;

public class AdminMapper implements RowMapper<Admin>{

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin ad=new Admin();
		ad.setId(rs.getInt("adminId"));
		ad.setName(rs.getString("adminName"));
		ad.setEmail(rs.getString("adminEmail"));
		ad.setUse_(rs.getString("adminUser"));
		ad.setPass(rs.getString("adminPass"));
		ad.setLevel(rs.getInt("level"));
		
		return ad;
	}

}
