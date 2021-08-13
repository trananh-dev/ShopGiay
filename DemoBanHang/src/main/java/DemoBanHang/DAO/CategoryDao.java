package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Mapper.BrandMapper;
import DemoBanHang.Mapper.CategoryMapper;

@Repository
public class CategoryDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Category> getDataCategory() {
		List<Category> list = new ArrayList<Category>();
		String sql = "SELECT * FROM tbl_category";
		list = _jdbcTemplate.query(sql, new CategoryMapper());
		return list;
		
	}
	
	

	public void add(Category cate) {
		String SQL = "INSERT INTO tbl_category (catName) VALUES ( ?)";
		_jdbcTemplate.update(SQL, cate.getName());
	}

	public void delete(int id) {
		String sql = "DELETE FROM tbl_category WHERE catId = " + id;
		_jdbcTemplate.update(sql);

	}

	public void update(Category cate) {
		String sql = "UPDATE tbl_category SET catName = ? WHERE catId = ? ";
		_jdbcTemplate.update(sql, cate.getName(),cate.getId());

	}
	public Category findById(int id) {
	    String sql = "SELECT * FROM tbl_category WHERE catId = ?";
	    return _jdbcTemplate.queryForObject(sql, new CategoryMapper(), id);
	  }
	
	public Category GetByCatName(int id) {
	    String sql = "SELECT * FROM tbl_category WHERE catId = "+ id + "";
	    return _jdbcTemplate.queryForObject(sql, new CategoryMapper());
	  }
}
