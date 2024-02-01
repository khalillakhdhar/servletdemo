package com.elite.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elite.model.Book;
import com.elite.model.Books;

@RestController // permet d'interagir directement avec le navigateur
public class HomeController {

	@GetMapping("book")
	public List<Book> getBooks()
{
		
return Books.books;	
}
	@PostMapping("book")
	public String addBook(@RequestBody Book book)
	{
		Books b=new Books();
		b.addBook(book);
		return book.toString() +" a été bien ajouté";
	}
}
