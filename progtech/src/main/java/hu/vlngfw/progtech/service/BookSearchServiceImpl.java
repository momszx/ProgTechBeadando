package hu.vlngfw.progtech.service;
import hu.vlngfw.progtech.model.Book;
import hu.vlngfw.progtech.dao.BookRepository;

import java.util.Collection;

public class BookSearchServiceImpl implements BookSearchService {
    private BookRepository bookRepository;
    public BookSearchServiceImpl(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @Override
    public Collection<Book> listActors() {
        return (Collection<Book>) bookRepository.findAll();
    }
}
