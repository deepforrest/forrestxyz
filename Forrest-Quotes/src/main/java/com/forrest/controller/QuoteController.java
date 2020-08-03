package com.forrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.models.Quote;
import com.forrest.repo.QuoteRepository;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

	@Autowired
	private QuoteRepository repo;
	
	@GetMapping("/test")
	public String test() {
		return "TEST SUCCESSFUL";
	}
	
	@PostMapping("/save")
	public String saveQuote(@RequestBody Quote quote) {
		try {
			System.out.println(quote);
			this.repo.save(quote);
			return "SUCCESS!";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
