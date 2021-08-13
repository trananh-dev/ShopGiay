package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.Category;

public class CategoryMapper implements RowMapper<Category>{

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setId(rs.getInt("catId"));
		category.setName(rs.getString("catName"));
		
		return category;
		
	}

}
