package com.example.booklogger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String getBook() {
        return bookService.getBookDetails();
    }

    @GetMapping("/book/error-demo")
    public String demonstrateError() {
        bookService.demonstrateErrorLogging();

        return "Error logging demonstration completed. Check the console.";
    }
}