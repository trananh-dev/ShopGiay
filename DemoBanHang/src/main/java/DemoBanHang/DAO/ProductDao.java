package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Dto.ProductDto;
import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Mapper.BrandMapper;
import DemoBanHang.Mapper.ProductMapper;

@Repository
public class ProductDao {

	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<ProductDto> getDataProduct() {
		List<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "SELECT * FROM tbl_product";
		list = _jdbcTemplate.query(sql, new ProductMapper());
		return list;
	}
	
	public List<ProductDto> getProductType() {
		List<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "SELECT * FROM tbl_product where PType = 1 order by  PID  limit 4";
		list = _jdbcTemplate.query(sql, new ProductMapper());
		return list;
	}
	
	public List<ProductDto> getProductNew() {
		List<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "SELECT * FROM tbl_product  order by PID desc limit 4";
		list = _jdbcTemplate.query(sql, new ProductMapper());
		return list;
	}
	
	public ProductDto GetProductById(int id){
		ProductDto list = new ProductDto();
		String sql = "SELECT * FROM tbl_product where PID = "+ id +"";
		list = _jdbcTemplate.queryForObject(sql, new ProductMapper());
		return list;
	}
	public List<ProductDto> getProductByCategory(int id) {
		List<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "SELECT * FROM tbl_product where catId ="+id+"";
		list = _jdbcTemplate.query(sql, new ProductMapper());
		return list;
	}
	
	public List<ProductDto> getProductByBrand(int id) {
		List<ProductDto> list = new ArrayList<ProductDto>();
		String sql = "SELECT * FROM tbl_product where brandId ="+id+"";
		list = _jdbcTemplate.query(sql, new ProductMapper());
		return list;
	}
	public void add(ProductDto product) {
		String SQL = "INSERT INTO tbl_product (	PName,catId,brandId,PDesciption,PPrice,discount,PImage,	PType) VALUES ( ?,?,?,?,?,?,?,?)";
		_jdbcTemplate.update(SQL, product.getName(),product.getCatid(),product.getBrandid(),product.getDesciption(),product.getPrice(),product.getDiscount(),product.getImg(),product.getType());
	}
	public ProductDto findById(int id) {
	    String sql = "SELECT * FROM tbl_product WHERE PID = ?";
	    return _jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
	  }
	public void delete(int id) {
		String sql = "DELETE FROM tbl_product WHERE PID = " + id;
		_jdbcTemplate.update(sql);

	}

	public void update(ProductDto product) {
		String sql = "UPDATE tbl_product SET PName = ?,catId = ?,brandId = ?,PDesciption = ?,PPrice = ? ,discount = ?,PImage = ?,	PType = ? where PID = ? ";
		_jdbcTemplate.update(sql, product.getName(),product.getCatid(),product.getBrandid(),product.getDesciption(),product.getPrice(),product.getDiscount(),product.getImg(),product.getType(),product.getId());

	}
}
