package hu.vlngfw.Testing;

import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.User;
import hu.vlngfw.service.RegistrationServiceImpl;
import org.junit.jupiter.api.Test;

public class UserInsertTest {
    private RegistrationServiceImpl registrationService;

    public UserInsertTest(RegistrationServiceImpl registrationService){
        this.registrationService=registrationService;
    }

    @Test
    public void UserInsert() throws Exception{
        String username ="TestElek";
        String password ="S3cret";
        String email ="Test@Elek.com";
        String fname ="Test";
        String lname="Elek";
        registrationService.register(new User(username,password,email,fname,lname));
    }
}
