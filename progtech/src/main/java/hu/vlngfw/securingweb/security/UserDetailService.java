package hu.vlngfw.securingweb.security;

import hu.vlngfw.dao.UserRepository;
import hu.vlngfw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user =userRepository.findByUsername(s);
        if (user==null){
            throw  new UsernameNotFoundException(s);
        }
        return (UserDetails) user;
    }
}
