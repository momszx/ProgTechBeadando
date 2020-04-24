package hu.vlngfw;

import hu.vlngfw.model.Book;
import hu.vlngfw.service.BookSearchService;
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


    @RequestMapping(value = "/hello/{name}")
    public String sayHellofor(@PathVariable("name") String name){
            return String.format("Hy %s",name);
        }

}