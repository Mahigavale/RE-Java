package com.pwc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.pwc.Repository.Demorepo;

@SpringBootApplication
public class InterviewApplication implements CommandLineRunner {
	
	
    
	
	RestTemplate resttemplate=new RestTemplate();
	
	String url="http://localhost:8084/find-by-id?id=3";
	
	ResponseEntity<String> response_by_temp=resttemplate.getForEntity(url,String.class);
	
	//Class<?> responsebody=response.getClass();
	
	
	
	
	WebClient webclient=WebClient.create("http://localhost:8084");
	
	String Response= webclient.get()
			         .uri("/find-by-id?id=3")
			         .retrieve()
			         .bodyToMono(String.class)
			         .block();
	
	
	
	private Demorepo repo;
	
	@Autowired
	public InterviewApplication(@Qualifier("arr") Demorepo repo)
	{
		this.repo=repo;
	}
	
	
	public InterviewApplication()
	{
		System.out.println("more constructorss....");
	}

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
		
	//	System.out.println(Response.get);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.log();
		
		System.out.println("response by Resttemplate....");
		System.out.println(response_by_temp.getBody());
		//System.out.println(responsebody);
		
		System.out.println("****************************");
		
		System.out.println("response by webclient......");
		
		System.out.println(Response);
		
		
		
	}
	
	

}
