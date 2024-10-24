package com.DataJPA;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.DataJPA.Entities.students;
import com.DataJPA.services.s_implemented;
import com.DataJPA.services.studentservice;

public class FetchAll {
	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(insert.class, args);
		studentservice stdservice=	context.getBean(s_implemented.class);
		
		
		List<students> std= stdservice.getdetails();
		
		for(students s : std) {
			
			System.out.println("Id :"+ s.getId()+", Name :"+s.getName()+", Address :"+s.getAddress());
			System.out.println("______________________________________");
			
		}
				
	}

}
