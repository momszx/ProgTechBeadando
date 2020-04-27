package hu.vlngfw.securingweb.security;

import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username =authentication.getName();
        String password =authentication.getCredentials().toString();
        User user =userRepository.findByUsername(username);
        if (user==null){
            throw  new UsernameNotFoundException(username);
        }
        if (user.getPassword().equals(password)==false){
            throw new BadCredentialsException("Authentication Failed");
        }
        return  new UsernamePasswordAuthenticationToken(username,password,user.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> autenttication) {
        return autenttication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
