package com.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.DataJPA.services.s_implemented;
import com.DataJPA.services.studentservice;

public class DeleteById {
	public static void main(String[] args) {
		
		ApplicationContext context=	SpringApplication.run(insert.class, args);
		studentservice stdservice=	context.getBean(s_implemented.class);
		
		
		boolean status= stdservice.deletestudent(202);
		
		if(status) {
			System.out.println( "Successfully Deleted");
			
		}
		else {
			System.out.println("Deletion failed  or not found");
			}
			
		}
		
}
