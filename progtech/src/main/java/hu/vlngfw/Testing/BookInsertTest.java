package hu.vlngfw.Testing;

import hu.vlngfw.model.Book;
import hu.vlngfw.service.BookAddServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class BookInsertTest {

    private BookAddServiceImpl bookAddService;
    Random rand = new Random();
    public BookInsertTest(BookAddServiceImpl bookAddServiceImpl){
        this.bookAddService=bookAddServiceImpl;
    }
    @Test
    public void UserInsert() throws Exception {
        String name = "TesKönyv";
        String owner = "Test Elek";
        String publisher = "Test Kiadó";
        Long isbn = rand.nextLong();
        bookAddService.add(new Book(name, owner, publisher, isbn));
    }
}
