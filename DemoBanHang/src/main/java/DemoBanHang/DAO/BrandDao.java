package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Mapper.BrandMapper;
import DemoBanHang.Mapper.CategoryMapper;

@Repository
@Transactional
public class BrandDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Brand> getDataBrand() {
		List<Brand> list = new ArrayList<Brand>();
		String sql = "SELECT * FROM tbl_brand";
		list = _jdbcTemplate.query(sql, new BrandMapper());
		return list;
	}

	public void add(Brand b) {
		String SQL = "INSERT INTO tbl_brand (brandName) VALUES ( ?)";
		_jdbcTemplate.update(SQL, b.getName());
	}

	public void delete(int id) {
		String sql = "DELETE FROM tbl_brand WHERE brandId = " + id;
		_jdbcTemplate.update(sql);

	}

	public void update(Brand b) {
		String sql = "UPDATE tbl_brand SET brandName = ? WHERE brandId = ? ";
		_jdbcTemplate.update(sql, b.getName(),b.getId());

	}
	public Brand findById(int id) {
	    String sql = "SELECT * FROM tbl_brand WHERE brandId = ?";
	    return _jdbcTemplate.queryForObject(sql, new BrandMapper(), id);
	  }
	
	

}
