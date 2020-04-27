package hu.vlngfw.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Collections;


@Entity
@Getter @Setter @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    Long id;
    String email;
    String username;
    String password;
    String Fname;
    String Lname;
    boolean admin;
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return Collections.emptyList();
    }
    public User( String email, String userName, String password, String Fname, String Lname){
        this.username=userName;
        this.password =password;
        this.email=email;
        this.Fname=Fname;
        this.Lname=Lname;
        this.admin=false;
    }
}
