package hu.vlngfw.service;

import hu.vlngfw.dao.BookRepository;
import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.Book;

public class BookAddServiceImpl implements BookAddSevice {
    private BookRepository bookRepository;
    public  BookAddServiceImpl(BookRepository bookRepository){this.bookRepository=bookRepository;}
    @Override
    public void add(Book book) throws Exception {
        bookRepository.save(book);
    }
}
