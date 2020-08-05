package com.forrest.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="keywords")
public class KeyWord {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="keyword")
	private String keyword;
	
	@ManyToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="quote_keywords",
			joinColumns=@JoinColumn(name="keyword_id"),
			inverseJoinColumns=@JoinColumn(name="quote_id")
			)
	private List<Quote> quotes;
	
	public KeyWord() {}

	public KeyWord(String keyWord) {
		System.out.println();
		this.keyword = keyWord;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}
	
	public void addQuote(Quote quote) {
		if(quotes == null) {
			quotes = new ArrayList<>();
		}
		
		quotes.add(quote);
	}

	@Override
	public String toString() {
		return "KeyWord [keyword=" + keyword + "]";
	}
	
	
	
	
	
}
