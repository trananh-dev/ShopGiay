package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.Brand;

public class BrandMapper implements RowMapper<Brand>{

		@Override
		public Brand mapRow(ResultSet rs, int rowNum) throws SQLException {
			Brand brand = new Brand();
			brand.setId(rs.getInt("brandId"));
			brand.setName(rs.getString("brandName"));
			
			return brand;
			
		}

}
