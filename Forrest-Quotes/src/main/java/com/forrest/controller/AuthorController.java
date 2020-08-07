package com.forrest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.models.Author;
import com.forrest.models.Quote;
import com.forrest.repo.AuthorRepository;
import com.forrest.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorRepository repo;
	@Autowired
	private AuthorService service;
	
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
		System.out.println("Added Quote: " + quote + " to author");
		try {
			repo.save(author);
			return "SUCCESS! Added author to DB";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
		
	}
	
	@GetMapping(value="/{name}")
	public List<String> getQuotes(@PathVariable String name) {
		try {
			Author author = repo.findByName(name);
			return service.getQuoteList(author);
		}catch(Exception e) {
			return new ArrayList<>();
		}
	}
	
	@PostMapping(value="/quote")
	public String addQuoteToAuthor(@RequestBody Quote quote) {
		Optional<Author> optional = repo.findById(1);	
		System.out.println(optional);
		if(optional.isPresent()) {
			Author author = optional.get();
			author.addQuote(quote);
			try {
				repo.save(author);
				return "Added Quote to author";
			}catch(Exception e) {
				return e.getMessage();
			}
		}
		return "Author not found";
		
	}
	
	
}
