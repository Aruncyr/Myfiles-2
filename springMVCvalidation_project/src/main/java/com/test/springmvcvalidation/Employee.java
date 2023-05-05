package com.test.springmvcvalidation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Employee {
	private String name;
	// Custom annotation
	@Password
	// below line is for mvc number validation 3rd example..
	// @Size(min=1,message="minimum 1 letters/characters are required")
	
	// below line is for mvc expression validation 2nd example..
	// @Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 3")

	// below line is for mvc validation 1st example..
	/* @Size(min = 8, message = "minimum 8 letters/characters are required") */
	
	//these lines are  for custom validation only..
	 private String password;  
    //Predefined annotation  
    @Min(value=18, message="must be equal or greater than 18")  
    @Max(value=45, message="must be equal or less than 45")  
	
	//this below lines are for 1,2,3,examples only..
	/*private String pass;
	// Predefined annotation
	@Min(value = 18, message = "must be equal or greater than 18")
	@Max(value = 45, message = "must be equal or less than 45")*/
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//these lines are  for custom validation only..
	public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
	//this below lines are for 1,2,3,examples only..
	/*public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}*/

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
