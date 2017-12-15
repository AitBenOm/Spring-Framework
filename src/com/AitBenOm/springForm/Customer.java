package com.AitBenOm.springForm;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.AitBenOm.springForm.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	private String lastName;
	
	@NotNull(message="Is Required !")
	@Min(value=0, message="Must be greater than ZERO !!")
	@Max(value=10, message="Must be less than TEN !!")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 Chars/Digits")
	private String postalCode;
	
	@CourseCode(value="toto", message="Must start xith toto")
	private String courseCode;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getpostalCode() {
		return postalCode;
	}
	public void setpostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
