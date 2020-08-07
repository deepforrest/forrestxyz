package com.forrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.forrest.models.Author;
import com.forrest.models.Quote;

@Service
public class AuthorService {

	public List<String> getQuoteList(Author author) {
		List<String> quotes = new ArrayList<>();
		for(Quote quote : author.getQuotes()) {
			quotes.add(quote.getQuotation());
		}
		return quotes;
	}
	
}
