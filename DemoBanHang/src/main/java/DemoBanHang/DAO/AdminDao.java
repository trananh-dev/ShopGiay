package DemoBanHang.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Entity.Admin;
import DemoBanHang.Mapper.AdminMapper;
@Repository
public class AdminDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public Admin GetUserByAcc(Admin admin) {
		String sql = "select * from tbl_admin where adminName = '"+ admin.getName() +"'";
		Admin rs = _jdbcTemplate.queryForObject(sql, new AdminMapper());
		return rs;
	}
	

}
