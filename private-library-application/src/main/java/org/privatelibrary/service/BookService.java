package org.privatelibrary.service;

import lombok.RequiredArgsConstructor;
import org.privatelibrary.domain.Book;
import org.privatelibrary.persistence.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
