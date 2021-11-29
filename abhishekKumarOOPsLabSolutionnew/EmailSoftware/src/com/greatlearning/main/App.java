package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.bean.Employee;
import com.greatlearning.service.CredentialService;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String firstName=sc.next();
		System.out.println("Enter Your Last Name");
		String lastName=sc.next();
		System.out.println("Kindly Choose the deparment from following options.");
		System.out.println("1 : Technical");
		System.out.println("2 : Admin");
		System.out.println("3 : Human Resource");
		System.out.println("4 : Legal");
		int op =sc.nextInt();
		System.out.println("Kindly Enter Your Company Name(Dont Put Space Between Words");
		String companyName=sc.next();
		Employee emp;
		switch(op){
		case 1: emp =new Employee(firstName,lastName,"technical",companyName);
		break;
		case 2: emp =new Employee(firstName,lastName,"admin",companyName);
		break;
		case 3: emp =new Employee(firstName,lastName,"humanressource",companyName);
		break;
		case 4: emp =new Employee(firstName,lastName,"legal",companyName);
		break;
		default:System.out.println("Invalid Option Kindly choose the department option properly.");
		return;
			
		}
		System.out.println("Hi"+firstName+", Welcome to "+companyName+" Your Credentials are shown Below");
		CredentialService cs =new CredentialService();
		String emailId=cs.genrateEmailId(emp);
		System.out.println("Email Id :"+emailId);
		String password =cs.generatePassword();
		System.out.println("Your Password is :"+password);
	}

}

