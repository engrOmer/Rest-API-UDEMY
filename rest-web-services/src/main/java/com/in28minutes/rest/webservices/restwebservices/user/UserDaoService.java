package com.in28minutes.rest.webservices.restwebservices.user;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static UserDaoService userDaoService;

    public static UserDaoService getUserDaoServiceInstance() {
        if (userDaoService == null) {
            userDaoService = new UserDaoService();
        }
        return userDaoService;
    }

    static {
        users.add(new User(1, "omer", new Date()));
        users.add(new User(2, "omer1", new Date()));
        users.add(new User(3, "omer2", new Date()));
        users.add(new User(4, "omer3", new Date()));
        users.add(new User(5, "omer4", new Date()));
    }

    public List<User> findAll() {
        return this.users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public List<User> searchUser(int id) {
        return this.users.stream().filter(user -> user.getId() == id).collect(Collectors.toList());
    }
}
