package com.forrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.models.Author;
import com.forrest.models.Quote;
import com.forrest.repo.AuthorRepository;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorRepository repo;
	
	@GetMapping("/test")
	public String test() {
		return "TEST SUCCESSFUL!";
	}
	
	@GetMapping("/insert_test")
	public String insertTest() {
		Quote quote = new Quote("Im going to put you on my shit-list");
		Author author = new Author("DR Hall", "drHall.com");
		author.addQuote(quote);
		System.out.println("Adding author: " + author);
		System.out.println("Added Quote: " + quote + " to auther");
		try {
			repo.save(author);
			return "SUCCESS! Added author to DB";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
}
