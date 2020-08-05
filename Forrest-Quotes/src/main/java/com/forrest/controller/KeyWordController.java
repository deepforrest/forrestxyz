package com.forrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forrest.models.KeyWord;
import com.forrest.repo.KeyWordRepository;

@RestController
@RequestMapping("/keyword")
public class KeyWordController {

	@Autowired
	private KeyWordRepository repo;
	
	@GetMapping("/test")
	public String test() {
		return "Keyword Test Successfull";
	}
	
	@PostMapping("/save")
	public String saveKeyword(@RequestBody KeyWord keyword) {
		try {
			System.out.println(keyword);
			repo.save(keyword);
			return "Successfully Saved KeyWord: " + keyword;
		}catch(Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}
