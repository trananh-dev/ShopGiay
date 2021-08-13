package DemoBanHang.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Service.AdminImpl.BrandServiceImpl;
import DemoBanHang.Service.AdminImpl.CategoryImpl;
import DemoBanHang.Service.AdminImpl.ProductServiceImpl;
import DemoBanHang.Service.User.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl HomeService;
	@Autowired
	ProductServiceImpl productService;
	@Autowired
	private CategoryImpl cat;
	@Autowired
	private BrandServiceImpl brand;
	
	

	@RequestMapping(value = { "/", "/trang-chu" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slide", HomeService.getDataSlide());
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("product", productService.getProductType());
		mv.addObject("productnew", productService.getProductNew());
		
		return mv;
	}

	@RequestMapping(value = { "/productbycat/{id}" })
	public ModelAndView product(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("user/productbycat");
		mv.addObject("slide", HomeService.getDataSlide());
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("probycat",productService.getProductByCategory(id));
		mv.addObject("catname", cat.findById(id));
		return mv;
	}
	
	@RequestMapping(value = { "/productbybrand/{id}" })
	public ModelAndView productByBrand(@PathVariable int id) {
		ModelAndView mv = new ModelAndView("user/productbybrand");
		mv.addObject("slide", HomeService.getDataSlide());
		mv.addObject("cat", HomeService.getDataCategory());
		mv.addObject("brand", HomeService.getDataBrand());
		mv.addObject("brandpr",productService.getProductByBrand(id));
		mv.addObject("brandname", brand.findById(id));
		return mv;
	}

}
