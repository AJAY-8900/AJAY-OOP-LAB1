package com.gl.service;

import java.util.Scanner;

import com.gl.model.Employee;

public class driver {

	public static void main(String[] args) {
		Employee employee = new Employee("Ajay", "Singh");
		service cs = new service();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option==1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			
		}
		
		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			
			
		}
		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatePassword();
			
					
		}
		
		else if (option ==4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			
			}
		else
			System.out.println("Eenter a valid option");
		sc.close();
	}

}
