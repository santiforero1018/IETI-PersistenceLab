package edu.eci.ieti.persistence.JavaPersistance.model;

import edu.eci.ieti.persistence.JavaPersistance.model.Dto.UserDto;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.email = userDto.getEmail();
    }


}
