package com.DataJPA.services;

import java.util.List;

import com.DataJPA.Entities.students;

public interface studentservice {
	
	public boolean addstudentDetails(students std);
	
	public List<students> getdetails();
	
	public students fetchbyId(int id);
	
	public boolean updateDetail(int id , String name );  // update name 
//	public boolean  updateDetail(int id , String name , String address);  // update 
	
	
	public boolean deletestudent(int id );
	

}
