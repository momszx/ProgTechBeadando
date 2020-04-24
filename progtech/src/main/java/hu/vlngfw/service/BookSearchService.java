package hu.vlngfw.service;

import hu.vlngfw.model.Book;

import java.util.Collection;

public interface BookSearchService {

    public Collection<Book> listBooks();
}
