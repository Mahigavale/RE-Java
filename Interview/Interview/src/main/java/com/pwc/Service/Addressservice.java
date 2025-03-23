package com.pwc.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pwc.Entity.AddressEntity;
import com.pwc.Repository.AddressRepo;

@Service
public class Addressservice {

	
	@Autowired
	private AddressRepo repo;
	
	
	public AddressEntity addad(AddressEntity entity)
	{
		return repo.save(entity);
		
	}
	
	public List<AddressEntity> findalladd()
	{
		
		return repo.findAll();
	}
}
