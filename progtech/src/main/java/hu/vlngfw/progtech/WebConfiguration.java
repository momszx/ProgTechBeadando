package hu.vlngfw.progtech;

import hu.vlngfw.progtech.dao.BookRepository;
import hu.vlngfw.progtech.service.BookSearchService;
import hu.vlngfw.progtech.service.BookSearchServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public BookSearchService bookSearchService(BookRepository bookRepository){
        return  new BookSearchServiceImpl(bookRepository);
    }
}
