package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Dto.ChiTietSp;
import DemoBanHang.Mapper.ChiTietSpMapper;

@Repository
public class ChiTietSpDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<ChiTietSp> getByIdPid(int id) {
		List<ChiTietSp> list = new ArrayList<ChiTietSp>();
		String sql = "SELECT * FROM chitietsp  where PID = "+id+" order by size asc";
		list = _jdbcTemplate.query(sql, new ChiTietSpMapper());
		return list;
		
		
	}

}
