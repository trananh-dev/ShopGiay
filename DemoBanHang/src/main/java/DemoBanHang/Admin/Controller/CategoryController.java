package DemoBanHang.Admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Entity.Brand;
import DemoBanHang.Entity.Category;
import DemoBanHang.Service.AdminImpl.CategoryImpl;

@Controller
@RequestMapping(value = "quan-tri/category")
public class CategoryController {
	@Autowired
	private CategoryImpl categoryService;

	@RequestMapping(value = { "/add", })
	public String addcatgory(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/add-category";

	}

	@RequestMapping(value = { "/saveadd" })
	public String saveBrand(@ModelAttribute("category") Category cate, Model model) {
		categoryService.add(cate);
		model.addAttribute("categorys", categoryService.getListCategory());
		return "admin/category/list-category";
	}

	@RequestMapping( "/del/{id}" )
	public String DeleteBrand(@PathVariable int id, Model model) {
		categoryService.delete(id);
		model.addAttribute("categorys", categoryService.getListCategory());
		return "admin/category/list-category";
	}
	@RequestMapping("/view/{id}")
	  public String viewBrand(@PathVariable int id, Model model) {
	    Category cate=categoryService.findById(id);
	    model.addAttribute("category", cate);
	    return "admin/category/edit";
	  }
	
	@RequestMapping("/update")
	  public String doUpdateCustomer(@ModelAttribute("category") Category cate, Model model) {
	   categoryService.update(cate);
	   model.addAttribute("categorys", categoryService.getListCategory());
	   return "admin/category/list-category";
	  }
	
	@RequestMapping(value = { "/list",},method = RequestMethod.GET)
	public ModelAndView listcategory() {
		
		ModelAndView mv = new ModelAndView("admin/category/list-category");
		mv.addObject("categorys", categoryService.getListCategory());
		return mv;
	}

}
