package com.example.springbootcourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcourse.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	List<Book> findByPublished(boolean published);
	List<Book> findByTitleContaining(String title);

}
