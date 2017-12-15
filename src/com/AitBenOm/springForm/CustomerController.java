package com.AitBenOm.springForm;

import java.util.Map;

import javax.validation.Valid;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	public void initBinder (WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String shoForm(Model model) {
		
		
	Customer customer = new Customer();
	
	model.addAttribute("customer", customer);

		return "customerForm";
		
	}
	
	@RequestMapping("/processForm")
	public String showcustomer(@Valid @ModelAttribute("customer") Customer thecustomer, BindingResult result) {
if(result.hasErrors()) {
	return "customerForm";
}else return "customer";
	}

}
