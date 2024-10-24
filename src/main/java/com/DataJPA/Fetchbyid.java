package com.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.DataJPA.Entities.students;
import com.DataJPA.services.s_implemented;
import com.DataJPA.services.studentservice;

public class Fetchbyid {

	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(insert.class, args);
		studentservice stdservice=	context.getBean(s_implemented.class);
		
		
		students std= stdservice.fetchbyId(2);
		
		if(std != null) {
			
			
			System.out.println("Id :"+ std.getId()+", Name :"+std.getName()+", Address :"+std.getAddress());
			System.out.println("______________________________________");
			
			
		}
		else {
			System.out.println(" Not found ");
		}

	}

}
