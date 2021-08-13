package DemoBanHang.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DemoBanHang.Dto.ProductDto;

@Service
public interface IProductService {
	@Autowired
	public List<ProductDto> getListProduct();
	public List<ProductDto> getProductType();
	public List<ProductDto> getProductNew();
	public ProductDto GetProductById(int id);
	public List<ProductDto> getProductByCategory(int id);
	public List<ProductDto> getProductByBrand(int id);
	public void add(ProductDto product);
	public ProductDto findById(int id);
	public void delete(int id);
	public void update(ProductDto product);

}
