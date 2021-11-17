package com.in28minutes.rest.webservices.restwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    /*
   Retrieve all users
   Retrieve a specific user
   Retrieve add a user
    */
    @GetMapping(path = "/getUsers")
    public List<User> getUsers() {
        return UserDaoService.getUserDaoServiceInstance().findAll();
    }

    @GetMapping(path = "/getUsers/{id}")
    public List<User> getUser(@PathVariable int id) {
        List<User> users = UserDaoService.getUserDaoServiceInstance().searchUser(id);
        if (users != null) {
            return users;
        } else {
        throw new UserNotFoundException("id"+id);
        }

    }

    @PostMapping(path = "/addUser")
    public ResponseEntity<Object> addUser(@RequestBody User user) {
        UserDaoService.getUserDaoServiceInstance().addUser(user);
        // to return the URI of the newly created user
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


}
