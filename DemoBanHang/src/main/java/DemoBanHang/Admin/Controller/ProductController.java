package DemoBanHang.Admin.Controller;

import java.nio.file.Path;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Dto.ProductDto;
import DemoBanHang.Service.AdminImpl.BrandServiceImpl;
import DemoBanHang.Service.AdminImpl.CategoryImpl;
import DemoBanHang.Service.AdminImpl.ProductServiceImpl;

@Controller
@RequestMapping(value = "quan-tri/product")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;
	@Autowired
	private BrandServiceImpl brandService;
	@Autowired
	private CategoryImpl categoryService;
	@Autowired
	ServletContext application;

	@RequestMapping(value = { "/add", })
	public String addbrand(Model model) {
		model.addAttribute("categorys", categoryService.getListCategory());
		model.addAttribute("brands", brandService.getListBrand());
		model.addAttribute("product", new ProductDto());
		return "admin/product/add-product";

	}

	@RequestMapping(value = { "/saveadd" })
	public String saveBrand(@ModelAttribute("product") ProductDto pro, Model model) {
		if (!pro.getFilename().isEmpty()) {
			String path = application.getRealPath("/");
		//	System.out.println(path);

			try {
				pro.setImg(pro.getFilename().getOriginalFilename());
				String filePath = path + "/layout/uploads/" + pro.getImg();
				pro.getFilename().transferTo(Path.of(filePath));
				pro.setFilename(null);
				productService.add(pro);
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		
		model.addAttribute("products", productService.getListProduct());
		return "admin/product/list-product";
	}

	@RequestMapping(value = { "/list", }, method = RequestMethod.GET)
	public ModelAndView listproduct() {
		ModelAndView mv = new ModelAndView("admin/product/list-product");
		mv.addObject("products", productService.getListProduct());

		return mv;
	}
	@RequestMapping( "/del/{id}" )
	public String DeleteProduct(@PathVariable int id, Model model) {
		productService.delete(id);
		model.addAttribute("products", productService.getListProduct());
		return "admin/product/list-product";
	}
	@RequestMapping("/view/{id}")
	  public String viewEdit(@PathVariable int id, Model model) {
		model.addAttribute("categorys", categoryService.getListCategory());
		model.addAttribute("brands", brandService.getListBrand());
	    ProductDto pro =productService.findById(id);
	    model.addAttribute("product", pro);
	    return "admin/product/edit_product";
	  }
	
	@RequestMapping("/update")
	  public String doUpdateCustomer(@ModelAttribute("product") ProductDto pro, Model model) {
		if (!pro.getFilename().isEmpty()) {
			String path = application.getRealPath("/");
		//	System.out.println(path);

			try {
				pro.setImg(pro.getFilename().getOriginalFilename());
				String filePath = path + "/layout/uploads/" + pro.getImg();
				pro.getFilename().transferTo(Path.of(filePath));
				pro.setFilename(null);
				productService.add(pro);
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
	   productService.update(pro);
	   model.addAttribute("products", productService.getListProduct());
		return "admin/product/list-product";
	  }

}
