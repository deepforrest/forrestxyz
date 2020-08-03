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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="wiki")
	private String wiki;
	
	@OneToMany(fetch=FetchType.LAZY,
			mappedBy="author",
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	private List<Quote> quotes;
	
	public Author() {}

	public Author(String name, String wiki) {
		this.name = name;
		this.wiki = wiki;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWiki() {
		return wiki;
	}

	public void setWiki(String wiki) {
		this.wiki = wiki;
	}
	
	public void addQuote(Quote quote) {
		if(quotes == null) {
			quotes = new ArrayList<>();
		}
		quotes.add(quote);
		quote.setAuthor(this);
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", wiki=" + wiki + "]";
	}
	
	
	
}
