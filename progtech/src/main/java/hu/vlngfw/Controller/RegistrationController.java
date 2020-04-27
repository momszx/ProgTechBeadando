package hu.vlngfw.Controller;

import hu.vlngfw.model.User;
import hu.vlngfw.service.RegistrationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

public class RegistrationController {
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService){
        this.registrationService=registrationService;
    }
    @RequestMapping(value = {"/register"},method = RequestMethod.POST)
    public void register(@RequestBody UserRegistrationRequest userRegistrationRequest) throws Exception {
        String username =userRegistrationRequest.getUsername();
        String password =userRegistrationRequest.getPassword();
        String email =userRegistrationRequest.getEmail();
        String fname =userRegistrationRequest.getFname();
        String lnaem=userRegistrationRequest.getLname();
        registrationService.register(new User(username,password,email,fname,lnaem));
    }
    @RequestMapping("/login")
    public User login(Principal principal){
        return  registrationService.login(principal.getName());
    }
}
