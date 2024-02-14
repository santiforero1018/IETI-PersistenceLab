package edu.eci.ieti.persistence.JavaPersistance.controllers;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import edu.eci.ieti.persistence.JavaPersistance.model.*;
import edu.eci.ieti.persistence.JavaPersistance.model.Dto.*;
import edu.eci.ieti.persistence.JavaPersistance.repositories.*;
import edu.eci.ieti.persistence.JavaPersistance.Exceptions.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UsersRepository userRepository;

    public UserController(@Autowired UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    User createUser(@RequestBody UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    User findById(@PathVariable Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent())
            return optionalUser.get();
        else throw new UserNotFoundException();
    }

}
