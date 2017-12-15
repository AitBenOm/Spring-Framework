package com.AitBenOm.springForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControll {
	
	@RequestMapping("/")
	public String showPage() {
		return "Main";
	}
	

}
