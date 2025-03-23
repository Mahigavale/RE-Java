package com.pwc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import com.pwc.Entity.BookEntity;

@Service
public class BookService {

	
	
	@Autowired
	private WebClient webclient;
	
	
	
	
	public BookEntity book(int id)
	{
	  return  webclient.get().uri(uriBuilder-> uriBuilder
			  .path("/find-by-id")
			  .queryParam("id", id)
			  .build())
			  .retrieve()
			  .bodyToMono(BookEntity.class)
			  .block();
	}
	
}
