package com.forrest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quotes")
public class Quote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="author")
	private String author;
	
	@Column(name="quotation")
	private String quotation;
	
	public Quote() {}

	public Quote(String author, String quotation) {
		super();
		this.author = author;
		this.quotation = quotation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getQuotation() {
		return quotation;
	}

	public void setQuotation(String quotation) {
		this.quotation = quotation;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", author=" + author + ", quotation=" + quotation + "]";
	}
	
	
}
