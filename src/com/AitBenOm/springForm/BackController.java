package com.AitBenOm.springForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackController {

	@RequestMapping("/showForm")
	public String showPage(Model model) {
		
		model.addAttribute("msg", "toto");
		return "Home";
	}
	
	
}
