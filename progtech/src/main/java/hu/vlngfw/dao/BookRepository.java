package hu.vlngfw.dao;

import hu.vlngfw.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
