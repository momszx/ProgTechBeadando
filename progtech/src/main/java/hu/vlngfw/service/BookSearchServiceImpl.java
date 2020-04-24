package hu.vlngfw.service;

import hu.vlngfw.model.Book;
import hu.vlngfw.dao.BookRepository;

import java.util.Collection;

public class BookSearchServiceImpl implements BookSearchService {

    private BookRepository bookRepository;

    public BookSearchServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Collection<Book> listBooks() {
        return (Collection<Book>) bookRepository.findAll();
    }


}
