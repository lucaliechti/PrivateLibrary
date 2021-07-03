package org.privatelibrary.controller;

import lombok.RequiredArgsConstructor;
import org.privatelibrary.domain.Book;
import org.privatelibrary.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping(path = "/books")
    public List<Book> getAllBooks() {
        return bookService.findAllBooks();
    }

}
