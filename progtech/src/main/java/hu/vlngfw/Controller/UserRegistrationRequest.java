package hu.vlngfw.Controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserRegistrationRequest {
    private String username;
    private String password;
    private String email;
    private String Fname;
    private String Lname;
}
