package com.pwc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pwc.Entity.AddressEntity;
import com.pwc.Entity.StudentEntity;
import com.pwc.Repository.AddressRepo;
import com.pwc.Repository.StudentRepo;

@Service
public class Studentservice {
	
	
	@Autowired
	private  StudentRepo  repo;
	
	@Autowired
	private AddressRepo repo2;
	
	
	public ResponseEntity<StudentEntity> addStudent(StudentEntity entity) throws Exception
	{
		
		if(entity ==null)
		{
			throw new Exception("Something went wrong...");
		}
		AddressEntity add_entity= repo2.findById(entity.getAdd().getAddid()).get();
		entity.setAdd(add_entity);
		return ResponseEntity.ok( repo.save(entity));
	}
	
	
	public ResponseEntity<List<StudentEntity>> findall()
	{
		
		return ResponseEntity.ok(repo.findAll());
		
	}

	
	public  ResponseEntity<StudentEntity> findbyid(int id) throws Exception
	{
		if(id<0)
		{
			throw new Exception("Invalid user id exception....");
		}
		
		return ResponseEntity.ok(repo.findById(id).get());
	}
	
//	public String deleteallStudents()
//	{
//		
//		repo.deleteAll();
//		
//		return ("done!");
//	}
	
	
	public String deleteallStudents()
	{
		
		repo.deleteAll();
		
		return "done!";
	}
}
