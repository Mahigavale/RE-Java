package com.pwc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.Entity.AddressEntity;
import com.pwc.Entity.StudentEntity;
import com.pwc.Repository.AddressRepo;
import com.pwc.Repository.StudentRepo;
import com.pwc.Service.Studentservice;

@RestController
public class StudentController {
	
	

	@Autowired
	private Studentservice service;
	
	
	
	@PostMapping("/add-student")
	public ResponseEntity<StudentEntity> addStudent(@RequestBody StudentEntity entity) throws Exception
	{
		
		
		  return  service.addStudent(entity);
		
	}
	
	
	@GetMapping("/get-all-students")
	public ResponseEntity<List<StudentEntity>> findallthat()
	{
		return service.findall();
	}

	
	
	
	@GetMapping("/get-student-by-id/{id}")
	public ResponseEntity<StudentEntity> findbyid(@PathVariable int id) throws Exception
	{
		
		return service.findbyid(id);
	}

	
	@DeleteMapping("/delete-all")
	public String delete()
	{
		
		return service.deleteallStudents();
	}
	
}
