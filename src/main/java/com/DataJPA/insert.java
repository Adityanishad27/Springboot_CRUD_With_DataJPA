package com.DataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.DataJPA.Entities.students;
import com.DataJPA.services.s_implemented;
import com.DataJPA.services.studentservice;

@SpringBootApplication
public class insert {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(insert.class, args);
studentservice stdservice=	context.getBean(s_implemented.class);

students std= new students();
std.setId(2);
std.setName("Adi2s");
std.setAddress("banaras");

  
boolean status=  stdservice.addstudentDetails(std);
  
  if(status) {
	  System.out.println("Succefully Inserted");
	  
  }
  else {
	System.out.println("Insertion failed");
}

	}

}
