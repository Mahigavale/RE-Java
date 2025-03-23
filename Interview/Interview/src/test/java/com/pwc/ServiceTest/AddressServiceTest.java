package com.pwc.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pwc.Entity.AddressEntity;
import com.pwc.Service.Addressservice;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@AutoConfigureTestDatabase
public class AddressServiceTest {

	
	@Autowired
	private Addressservice service;
	
	
	
	@Test
	@Order(1)
	public void saveaddressnotnulltest()
	{
		
		AddressEntity add=new AddressEntity("ahmadpur","122234","mah");
		
		AddressEntity entity=service.addad(add);
		
		System.out.println("First");
		assertNotEquals(null, entity);
		
		
	}
	
	@Test
	@Order(2)
	public void getallOrders()
	{
		AddressEntity add_one=new AddressEntity("ahmadpur","122234","mah");
		AddressEntity add_two=new AddressEntity("udgir","898989","KAR");
		
		service.addad(add_two);
		service.addad(add_one);
		
		System.out.println("second");
		
		//assertNotEquals(null, service.findalladd().isEmpty());
		assertFalse(service.findalladd().isEmpty());
		

	}
}
