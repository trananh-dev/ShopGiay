package DemoBanHang.Service.AdminImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.DAO.ProductDao;
import DemoBanHang.Dto.ProductDto;
import DemoBanHang.Service.Admin.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<ProductDto> getListProduct() {
		
		return productDao.getDataProduct();
	}

	@Override
	public List<ProductDto> getProductType() {
		
		return productDao.getProductType();
	}

	@Override
	public List<ProductDto> getProductNew() {
		return productDao.getProductNew();
	}

	@Override
	public ProductDto GetProductById(int id) {
		return productDao.GetProductById(id);
	}

	@Override
	public List<ProductDto> getProductByCategory(int id) {
		return productDao.getProductByCategory(id);
	}

	@Override
	public List<ProductDto> getProductByBrand(int id) {
		return productDao.getProductByBrand(id);
	}

	@Override
	public void add(ProductDto product) {
		productDao.add(product);
		
	}

	@Override
	public ProductDto findById(int id) {
		
		return productDao.findById(id);
	}

	@Override
	public void delete(int id) {
		productDao.delete(id);
		
	}

	@Override
	public void update(ProductDto product) {
		productDao.update(product);
		
	}

}
