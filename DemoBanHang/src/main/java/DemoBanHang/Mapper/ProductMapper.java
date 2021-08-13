package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Dto.ProductDto;

public class ProductMapper implements RowMapper<ProductDto> {

	@Override
	public ProductDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDto pro = new ProductDto();
		pro.setId(rs.getInt("PId"));
		pro.setName(rs.getString("PName"));
		pro.setCatid(rs.getInt("catId"));
		pro.setBrandid(rs.getInt("brandId"));
		pro.setDesciption(rs.getString("PDesciption"));
		pro.setPrice(rs.getInt("PPrice"));
		pro.setDiscount(rs.getInt("discount"));
		pro.setImg(rs.getString("PImage"));
		pro.setType(rs.getInt("PType"));
		
		
		
		return pro;
	}

}
