package com.forrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.models.Author;
import com.forrest.models.KeyWord;
import com.forrest.models.Quote;
import com.forrest.repo.AuthorRepository;
import com.forrest.repo.QuoteRepository;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

	@Autowired
	private QuoteRepository repo;
	@Autowired
	private AuthorRepository authorRepo;
	
	@GetMapping("/test")
	public String test() {
		return "TEST SUCCESSFUL";
	}
	
	@GetMapping("/quotes")
	public List<Quote> getAllQuotes() {
		try {
			return repo.findAll();
		}catch(Exception e){
			return new ArrayList<>();
		}
	}
	
	@PostMapping("/save")
	public String saveQuote(@RequestBody Quote quote) {
		try {
			//Get Author
			Author author = new Author();
			if(quote.getAuthor().getName() != null) {
				System.out.println("Author from Quote: " + quote.getAuthor());
				author = authorRepo.findByName(quote.getAuthor().getName());
				System.out.println("Author from query: " + author);
			}
			//add to quote
			quote.setAuthor(author);
			//save
			System.out.println(quote);
			this.repo.save(quote);
			return "SUCCESS!";
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	@GetMapping("/test_fullquote")
	public String testFullQuote() {
		KeyWord keyword1 = new KeyWord("Fear");
		KeyWord keyword2 = new KeyWord("Encourage");
		Author author = new Author("Dr. Hall", "drHallWiki");
		Quote quote = new Quote("Your on the shit list");
		quote.setAuthor(author);
		quote.addKeyWord(keyword1);
		quote.addKeyWord(keyword2);
		System.out.println("Adding Quote: " + quote);
		try {
			repo.save(quote);
			return "Success";
		}catch(Exception e) {
			return "Failed";
		}
	}
	
	
}
