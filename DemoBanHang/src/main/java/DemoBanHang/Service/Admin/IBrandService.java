package DemoBanHang.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DemoBanHang.Entity.Brand;

@Service
@Transactional
public interface IBrandService {
	@Autowired
	public void add(Brand b);
	public List<Brand>getListBrand();
	public void delete(int id);
	public void update(Brand b);
	public Brand findById(int id);
		

}
