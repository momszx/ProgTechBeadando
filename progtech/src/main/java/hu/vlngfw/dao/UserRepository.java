package hu.vlngfw.dao;

import hu.vlngfw.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,String> {
    User findByUsername(String username);
}
