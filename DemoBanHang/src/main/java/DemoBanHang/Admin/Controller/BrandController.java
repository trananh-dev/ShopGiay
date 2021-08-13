package DemoBanHang.Admin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DemoBanHang.Entity.Brand;
import DemoBanHang.Service.AdminImpl.BrandServiceImpl;

@Controller
@RequestMapping(value = "quan-tri/brand")
public class BrandController {
	@Autowired
	private BrandServiceImpl brandService;

	@RequestMapping(value = { "/add", })
	public String addbrand(Model model) {
		model.addAttribute("brand", new Brand());
		return "admin/brand/add-brand";

	}

	@RequestMapping(value = { "/saveadd" })
	public String saveBrand(@ModelAttribute("brand") Brand br, Model model) {
		brandService.add(br);
		model.addAttribute("brands", brandService.getListBrand());
		return "admin/brand/list-brand";
	}

	@RequestMapping( "/del/{id}" )
	public String DeleteBrand(@PathVariable int id, Model model) {
		brandService.delete(id);
		model.addAttribute("brands", brandService.getListBrand());
		return "admin/brand/list-brand";
	}
	@RequestMapping("/view/{id}")
	  public String viewBrand(@PathVariable int id, Model model) {
	    Brand brand = brandService.findById(id);
	    model.addAttribute("brand", brand);
	    return "admin/brand/edit";
	  }
	
	@RequestMapping("/update")
	  public String doUpdateCustomer(@ModelAttribute("brand") Brand brand, Model model) {
	   brandService.update(brand);
	   model.addAttribute("brands", brandService.getListBrand());
	   return "admin/brand/list-brand";
	  }

	@RequestMapping(value = { "/list" })
	public ModelAndView brand() {
		ModelAndView mv = new ModelAndView("admin/brand/list-brand");
		mv.addObject("brands", brandService.getListBrand());
		return mv;
	}
	
}
