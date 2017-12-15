package com.AitBenOm.springForm.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	
	private String[] coursePrifix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		this.coursePrifix=theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidator) {
	
		boolean result = false;
		if(theCode != null) {
			   for (String tempPrefix : coursePrifix) {
	                result = theCode.startsWith(tempPrefix);
	                
	                // if we found a match then break out of the loop
	                if (result) {
	                    break;
	                }
	            }
	        }
	        else {
	            result = true;
	        }
	        
	        return result;
	}
	

}
