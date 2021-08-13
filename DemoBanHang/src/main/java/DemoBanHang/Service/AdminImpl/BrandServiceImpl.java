package DemoBanHang.Service.AdminImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DemoBanHang.DAO.BrandDao;
import DemoBanHang.Entity.Brand;
import DemoBanHang.Service.Admin.IBrandService;

@Service
@Transactional
public class BrandServiceImpl implements IBrandService {
	@Autowired
	private BrandDao brandDao;

	@Override
	public void add(Brand b) {
		brandDao.add(b);

	}

	@Override
	public List<Brand> getListBrand() {
		return brandDao.getDataBrand();

	}

	@Override
	public void delete(int id) {
		brandDao.delete(id);

	}

	@Override
	public void update(Brand b) {
		brandDao.update(b);

	}

	@Override
	public Brand findById(int id) {

		return brandDao.findById(id);
	}
	

}
