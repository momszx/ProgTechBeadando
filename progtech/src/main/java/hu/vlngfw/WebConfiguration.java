package hu.vlngfw;

import hu.vlngfw.dao.BookRepository;
import hu.vlngfw.service.BookSearchService;
import hu.vlngfw.service.BookSearchServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public BookSearchService bookSearchService(BookRepository bookRepository){
        return new BookSearchServiceImpl(bookRepository);
    }

    

}
