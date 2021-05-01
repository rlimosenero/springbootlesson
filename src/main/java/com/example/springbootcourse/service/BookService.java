/*
 * package com.example.springbootcourse.service;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.example.springbootcourse.model.Book; import
 * com.example.springbootcourse.model.Books;
 * 
 * @Service public class BookService {
 * 
 * @Autowired Books books;
 * 
 * public List<Book> getListBook() {
 * 
 * List<Book> listBook = new ArrayList<Book>(); listBook.add(new
 * Book("Spring boot for Dummies","",""));
 * 
 * listBook.add(new Book("Java Essential","atutohr","Programming"));
 * listBook.add(new Book("Java Essential 2","again","Programming"));
 * 
 * 
 * return listBook; }
 * 
 * public Book findBook(String name) {
 * 
 * Book book = getListBook().stream() // Convert to steam .filter(x ->
 * name.equals(x.getName())) // we want name only .findAny() // If 'findAny'
 * then return found .orElse(null);
 * 
 * return book; }
 * 
 * }
 */