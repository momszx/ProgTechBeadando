package hu.vlngfw.service;

import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.User;

public class RegistrationServiceImpl implements RegistrationService{

    private UserRepository userRepository;

    public  RegistrationServiceImpl(UserRepository userRepository){
        this.userRepository =userRepository;
    }

    @Override
    public void register(User user) throws Exception {
        if(userRepository.findByUsername(user.getUsername())!=null){
            throw new Exception();
        }
        userRepository.save(user);
    }

    @Override
    public User login(String username) {
        return userRepository.findByUsername(username);
    }
}
