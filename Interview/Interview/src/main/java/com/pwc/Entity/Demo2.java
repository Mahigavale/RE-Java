package com.pwc.Entity;

import org.springframework.stereotype.Component;

import com.pwc.Repository.Demorepo;

@Component("arr")
public class Demo2 implements Demorepo {
	
	
	@Override
	public void log()
	{
		System.out.println("Cloudwatch Logging....");
	}
	
	
	

}
