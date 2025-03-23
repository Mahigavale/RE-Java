package com.pwc.Entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.pwc.Repository.Demorepo;

@Component
@Primary
public class Demo implements Demorepo {

	
	
	@Override
	public void log()
	{
		System.out.println("loggin into the DB:");
	}
}
