package hu.vlngfw.progtech;

import hu.vlngfw.progtech.model.Book;
import hu.vlngfw.progtech.service.BookSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = {"/book"})
public class BookController {

    @Autowired
    private BookSearchService bookSearchService;

    @RequestMapping(value = {"/all"},method = RequestMethod.GET)
    public Collection<Book> AllBook(){return  bookSearchService.listActors();}
}
