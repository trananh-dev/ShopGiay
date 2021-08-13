package DemoBanHang.Service.AdminImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.CategoryDao;
import DemoBanHang.Entity.Category;
import DemoBanHang.Service.Admin.ICategoryService;
@Service
public class CategoryImpl implements ICategoryService{
	
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public void add(Category cate) {
		categoryDao.add(cate);
		
	}

	@Override
	public List<Category> getListCategory() {
		
		return categoryDao.getDataCategory();
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
		
	}

	@Override
	public void update(Category b) {
		categoryDao.update(b);;
		
	}

	@Override
	public Category findById(int id) {
		
		return categoryDao.findById(id);
	}

	@Override
	public Category GetByCatName(int id) {
		return categoryDao.GetByCatName(id);
	}

}
