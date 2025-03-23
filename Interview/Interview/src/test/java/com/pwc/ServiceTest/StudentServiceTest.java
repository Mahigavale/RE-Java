package com.pwc.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.pwc.Entity.AddressEntity;
import com.pwc.Entity.StudentEntity;
import com.pwc.Repository.StudentRepo;
import com.pwc.Service.Studentservice;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
@AutoConfigureTestDatabase
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentServiceTest {
	
	
	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private Studentservice service;
	
//	
//	@Autowired
//	private StudentRepo repo2;
	
	
	@Test
	@Order(1)
	public void saveuserTest()
	{
		
		//Arrange
		AddressEntity add= new AddressEntity("Pune","413604","Mah");
		StudentEntity student=new StudentEntity("mahesh", "mag@gmail.com", 98, add);
		
		//Act
		
		StudentEntity student2=repo.save(student);
		
		
		//Assert
		
	       assertNotNull(student2.getAdd());
	       
	       assertEquals("mahesh", student2.getName());
	       
	      System.out.println(student.getId());
		
	}
	
	
	
	
	
	
	
	
	@Test
	@Order(2)
	public void getStudentbyID()
	{
		AddressEntity add= new AddressEntity("Pune","413604","Mah");
		StudentEntity student=new StudentEntity("mahesh", "mag@gmail.com", 98, add);
		
		StudentEntity student2=repo.save(student);
		
		
		StudentEntity getStudent=repo.findById(student.getId()).get(); 
		
		assertEquals(student.getId(), getStudent.getId());

		
	}
	

	
	@Test
	@Order(3)
	public void  deleteallstudents()
	{
		AddressEntity add= new AddressEntity("Pune","413604","Mah");

		StudentEntity student=new StudentEntity("mahesh", "mag@gmail.com", 98, add);
		
		StudentEntity student2=new StudentEntity("pooja","pag@gmail.com",77,add);
		
		List<StudentEntity> students= new ArrayList<StudentEntity>();
		
		students.add(student2);
		students.add(student);
		repo.saveAll(students);
		String result=service.deleteallStudents();
		
		
		assertEquals("done!", result);

	}
}
