package com.pwc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pwc.Entity.BookEntity;
import com.pwc.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	
	@Autowired
	private BookService service;
	
	
	@GetMapping("/get-book-by-id/{id}")
	public BookEntity getbyid(@PathVariable int id)
	{
		return service.book(id);
	}
	
	
	
	

}
