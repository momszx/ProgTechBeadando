package hu.vlngfw.Controller;

import hu.vlngfw.model.Book;
import hu.vlngfw.service.BookAddServiceImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BookAddController {
    private BookAddServiceImpl bookAddService;

    public BookAddController(BookAddServiceImpl bookAddServiceImpl){
        this.bookAddService=bookAddServiceImpl;
    }
    @RequestMapping(value = {"/add"},method = RequestMethod.POST)
    public void register(@RequestBody BookAddRequest bookAddRequest) throws Exception {
        String name = bookAddRequest.getName();
        String owner = bookAddRequest.getOwner();
        String publisher = bookAddRequest.getPublisher();
        Long isbn = bookAddRequest.getISBN();
        bookAddService.add(new Book(name,owner,publisher,isbn));
    }
}
