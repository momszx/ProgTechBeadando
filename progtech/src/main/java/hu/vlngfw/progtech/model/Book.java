package hu.vlngfw.progtech.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter @Setter @NoArgsConstructor
public class Book {
    public Book(String owner, String name, String publisher, Long ISBN) {
        Owner = owner;
        Name = name;
        Publisher = publisher;
        this.ISBN = ISBN;
    }

    @Id
    @GeneratedValue
    Long id;
    String Owner;
    String Name;
    String Publisher;
    Long ISBN;
}
