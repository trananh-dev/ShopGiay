package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Dto.ChiTietSp;

public class ChiTietSpMapper  implements RowMapper<ChiTietSp>{

	@Override
	public ChiTietSp mapRow(ResultSet rs, int rowNum) throws SQLException {
		ChiTietSp ct =new ChiTietSp();
		ct.setId(rs.getInt("ID"));
		ct.setPid(rs.getInt("PID"));
		ct.setSize(rs.getInt("size"));
		ct.setColor(rs.getString("color"));
		ct.setSlnhap(rs.getInt("slnhap"));
		ct.setSndat(rs.getInt("slorder"));
		return ct;
	}

}
