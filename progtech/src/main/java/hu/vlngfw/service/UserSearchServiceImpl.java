package hu.vlngfw.service;

import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.User;

import java.util.Collection;

public class UserSearchServiceImpl implements UserSearchService {

    private UserRepository userRepository;

    public UserSearchServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override
    public Collection<User> listUser() {
        return (Collection<User>) userRepository.findAll();
    }
}
