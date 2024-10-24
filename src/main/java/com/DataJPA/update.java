package com.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.DataJPA.services.s_implemented;
import com.DataJPA.services.studentservice;

public class update {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(insert.class, args);
		studentservice stdservice=	context.getBean(s_implemented.class);
		
		boolean status= stdservice.updateDetail(2, "babban boss");
		
		if(status) {
		System.out.println("Updated Successfully  ");
		}
		else {
		System.out.println("Not Updated due to some error.......s");
		}
		
		

	}

}
