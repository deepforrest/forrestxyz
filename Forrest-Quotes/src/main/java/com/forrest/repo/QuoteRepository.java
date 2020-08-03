package com.forrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forrest.models.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Integer>{

}
