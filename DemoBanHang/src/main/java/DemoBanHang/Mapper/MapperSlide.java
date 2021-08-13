package DemoBanHang.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import DemoBanHang.Entity.Slide;

public class MapperSlide implements RowMapper<Slide> {

	@Override
	public Slide mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slide slide = new Slide();
		slide.setId(rs.getInt("sliderId"));
		slide.setName(rs.getString("sliderName"));
		slide.setImg(rs.getString("slider_image"));
		slide.setType(rs.getInt("type"));
		return slide;
	}

}
