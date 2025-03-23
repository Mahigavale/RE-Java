package com.pwc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.Entity.AddressEntity;
import com.pwc.Repository.AddressRepo;
import com.pwc.Service.Addressservice;

@RestController
public class AddressController {
	
	
	@Autowired
	private Addressservice service;
	
	
	@PostMapping("/add-ad")
	public AddressEntity saveaddress(@RequestBody AddressEntity ent)
	{
		return service.addad(ent);
	}
	
	
	@GetMapping("/get-all")
	public List<AddressEntity> getalladd()
	{
		return service.findalladd();
	}

}
