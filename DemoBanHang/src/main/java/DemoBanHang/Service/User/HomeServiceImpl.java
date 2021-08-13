package DemoBanHang.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.BrandDao;
import DemoBanHang.DAO.CategoryDao;
import DemoBanHang.DAO.SlidesDAO;
import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Entity.Slide;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDAO slideDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private BrandDao brandDao;

	@Override
	public List<Slide> getDataSlide() {
		return slideDao.getDataSlide();
	}

	@Override
	public List<Category> getDataCategory() {
		return categoryDao.getDataCategory();
	}

	public List<Brand> getDataBrand() {
		return brandDao.getDataBrand();
	}

}
