package com.DataJPA.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DataJPA.Entities.students;
import com.DataJPA.Repository.studentRepository;
@Service
public class s_implemented implements studentservice{
	@Autowired
	private studentRepository studentRepository;

	
	//+++++++++ INSERT ++++++++++++++++++++++
	@Override
	public boolean addstudentDetails(students std) {
		boolean status=false;
		try {
			
			studentRepository.save(std);
			
			status= true;
			
			
			
		}
		
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	
		return status;
	}
//++++++++++++ FETCH +++++++++++++++++++++++++++++
	@Override
	public List<students> getdetails() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	//+++++++++++Fetch By id ++++++++++++++++++++++
	@Override
	public students fetchbyId(int id) {
Optional<students>	optional=	studentRepository.findById(id);

if(optional.isPresent()) {
	
	return optional.get();
	
}
		return null;
	}
	
	
	// +++++++++++=UPdate Name by Id +++++++++++++
	@Override
	public boolean updateDetail(int id, String name) {
	
		
		students std=fetchbyId(id);
		
		if(std != null) {
			
			std.setName(name);
			studentRepository.save(std);
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	// +++++ Delete ++++++++++++++++
	@Override
	public boolean deletestudent(int id ) {
		boolean status= false;
		students stud=fetchbyId(id);
		
		if(stud != null) {
			
			try {
			
			studentRepository.deleteById(id);
			status= true;
		}
			
			catch (Exception e) {
				e.printStackTrace();
				status= false;			}
		}
		
		
		
		return status;
		
		
	}

	

}
