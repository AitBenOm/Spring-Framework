package com.AitBenOm.springForm;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryList}")
	private Map<String, String> countryList;
	
	@RequestMapping("/showForm")
	public String shoForm(Model model) {
		
		
	Student student = new Student();
	
	model.addAttribute("student", student);
	model.addAttribute("countries", this.countryList);
		return "studentForm";
		
	}
	
	@RequestMapping("/processForm")
	public String showStudent(@ModelAttribute("student") Student theStudent) {

		System.out.println("the Student"+ theStudent.getFirstName());
		System.out.println("the Student"+ theStudent.getLastName());
		return "student";
	}
	

}
