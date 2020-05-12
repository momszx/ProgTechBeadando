package hu.vlngfw.Controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BookAddRequest {
    String Owner;
    String Name;
    String Publisher;
    Long ISBN;
}
