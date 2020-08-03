package com.forrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forrest.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
