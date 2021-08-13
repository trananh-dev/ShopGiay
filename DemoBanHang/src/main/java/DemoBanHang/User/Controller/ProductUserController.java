package DemoBanHang.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Dto.ProductDto;
import DemoBanHang.Service.AdminImpl.BrandServiceImpl;
import DemoBanHang.Service.AdminImpl.CategoryImpl;
import DemoBanHang.Service.AdminImpl.ChitietspServiceImpl;
import DemoBanHang.Service.AdminImpl.ProductServiceImpl;
import DemoBanHang.Service.User.HomeServiceImpl;

@Controller
public class ProductUserController {
	@Autowired
	HomeServiceImpl HomeService;

	@Autowired
	ProductServiceImpl productService;
	@Autowired
	private CategoryImpl cat;
	@Autowired
	private BrandServiceImpl brand;
	@Autowired
	private ChitietspServiceImpl ctsp;

	

	@RequestMapping(value = { "/chi-tiet-san-pham/{id}" })
	public ModelAndView product(@PathVariable int id) {

		ModelAndView mv = new ModelAndView("user/chitiet");
		mv.addObject("slide", HomeService.getDataSlide());
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("chitiet", productService.GetProductById(id));
		int catId = productService.GetProductById(id).getCatid();
		mv.addObject("catName", cat.GetByCatName(catId));
		int brandid = productService.GetProductById(id).getBrandid();
		mv.addObject("br", brand.findById(brandid));
		int pid= productService.GetProductById(id).getId();
		mv.addObject("ctsanpham", ctsp.getByIdPid(id));
		return mv;
	}
	
	

}
