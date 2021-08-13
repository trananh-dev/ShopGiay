package DemoBanHang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Entity.Slide;

@Service
public interface IHomeService {
	@Autowired
	public List<Slide> getDataSlide();
	public List<Category> getDataCategory();
	public List<Brand> getDataBrand() ;

}
