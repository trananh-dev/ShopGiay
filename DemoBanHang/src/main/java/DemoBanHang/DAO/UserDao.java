package DemoBanHang.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Entity.Category;
import DemoBanHang.Entity.User;
import DemoBanHang.Mapper.CategoryMapper;
import DemoBanHang.Mapper.UserMapper;

@Repository
public class UserDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public int AddUser(User user) {

		String sql = "insert into tbl_customer(name,address,city,phone,email,password) values(?,?,?,?,?,?)";
		int i = _jdbcTemplate.update(sql, user.getName(), user.getAdd(), user.getCity(), user.getPhone(),
				user.getEmail(), user.getPass());
		return i;
	}

	public User GetUserByAcc(User user) {
		String sql = "select * from tbl_customer where email ='" + user.getEmail() + "'";
		User rs = _jdbcTemplate.queryForObject(sql, new UserMapper());
		return rs;
	}

	public void Update(User user) {
		String sql = "update  tbl_customer set name = ? , address = ? ,city = ? , phone = ? , email = ? where ID = ? ";
		_jdbcTemplate.update(sql, user.getName(), user.getAdd(), user.getCity(), user.getPhone(),
				user.getEmail(), user.getId());
	}
	public User findById(int id) {
	    String sql = "SELECT * FROM tbl_customer WHERE ID = ?";
	    return _jdbcTemplate.queryForObject(sql, new UserMapper(), id);
	  }

}
