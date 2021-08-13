package DemoBanHang.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DemoBanHang.Entity.Category;

@Service
@Transactional
public interface ICategoryService {

	@Autowired
	public void add(Category cate);

	public List<Category> getListCategory();

	public void delete(int id);

	public void update(Category b);

	public Category findById(int id);
	public Category GetByCatName(int id);

}
