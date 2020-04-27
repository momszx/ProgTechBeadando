package hu.vlngfw;

import hu.vlngfw.dao.BookRepository;
import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.service.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public BookSearchService bookSearchService(BookRepository bookRepository){
        return new BookSearchServiceImpl(bookRepository);
    }

    @Bean
    public RegistrationService registrationService(UserRepository userRepository){
        return new RegistrationServiceImpl(userRepository);
    }
}
