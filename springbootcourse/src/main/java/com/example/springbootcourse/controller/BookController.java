package com.example.springbootcourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcourse.model.Book;
import com.example.springbootcourse.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookservice;

	
	@GetMapping("/book")
	public List<Book> getAllBooks() {

		return bookservice.getListBook();
	}
	
	@GetMapping("/book/{name}")
	public Book findBook(@PathVariable String name) {

		return bookservice.findBook(name);
	}

}
