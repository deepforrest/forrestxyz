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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="quotes")
public class Quote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="quotation")
	private String quotation;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
					CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="author_id")
	private Author author;
	
	@ManyToMany(fetch=FetchType.LAZY,
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="quote_keywords",
			joinColumns=@JoinColumn(name="quote_id"),
			inverseJoinColumns=@JoinColumn(name="keyword_id")
			)
	private List<KeyWord> keywords;
	
	//===CONSTRUCTOR===
	public Quote() {}

	public Quote(String quotation) {
		this.quotation = quotation;
	}
	
	public Quote(String quotation, Author author) {
		this.quotation = quotation;
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuotation() {
		return quotation;
	}

	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	
	public List<KeyWord> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<KeyWord> keywords) {
		this.keywords = keywords;
	}

	public void addKeyWord(KeyWord keyword) {
		if(keywords == null) {
			keywords = new ArrayList<>();
		}
		keywords.add(keyword);
	}
	
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quotation=" + quotation + "]";
	}

	
	
	
	
}
