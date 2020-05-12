package hu.vlngfw;

import hu.vlngfw.Controller.BookAddRequest;
import hu.vlngfw.Controller.UserRegistrationRequest;
import hu.vlngfw.model.Book;
import hu.vlngfw.model.User;
import hu.vlngfw.service.BookAddServiceImpl;
import hu.vlngfw.service.BookSearchService;
import hu.vlngfw.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping(value = {"/book"})
public class BookController {


    @Autowired
    private BookSearchService bookSearchService;

    @RequestMapping(value={"/all","/mind"}, method = RequestMethod.GET)
    public Collection<Book> fetchAllActors(){
        return bookSearchService.listBooks();
    }
}