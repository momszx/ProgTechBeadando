package hu.vlngfw.service;

import hu.vlngfw.model.User;

public interface RegistrationService {

    void register(User user) throws Exception;
    User login(String username);
}
