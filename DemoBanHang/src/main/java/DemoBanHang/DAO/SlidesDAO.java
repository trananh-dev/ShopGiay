package DemoBanHang.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import DemoBanHang.Entity.Slide;
import DemoBanHang.Mapper.MapperSlide;

@Repository

public class SlidesDAO {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Slide> getDataSlide() {
		List<Slide> list = new ArrayList<Slide>();
		String sql="SELECT * FROM tbl_slider";
		list=_jdbcTemplate.query(sql, new MapperSlide());
		return list;
	}

}
