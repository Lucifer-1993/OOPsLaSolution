package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.bean.Employee;


public class CredentialService {
	
    //Generate Email Id 
	public String genrateEmailId(Employee emp) {
		return emp.getFirstName().toLowerCase()+""+emp.getLastName().toLowerCase()+"@"+emp.getDepartmentName()+"."+emp.getCompanyName().toLowerCase()+"."+"com";
	}
	// Generate Password	
		
		
	public String generatePassword(){
		String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@*$&";
		char password[]=new char[8];
		Random ran =new Random();
		for(int i=0;i<8;i++) {
			int n =ran.nextInt(passwordCharacters.length());
			password[i]=passwordCharacters.charAt(n);
		}
		return String.valueOf(password);

		
	}	
	}

