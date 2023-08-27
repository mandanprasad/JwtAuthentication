package com.example.schoolproject.services;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.schoolproject.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Mandan", "mandan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Suman", "suman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Nitikha", "nitikha@gmail.com"));

    }

    public List<User> getUser() {
        return this.store;
    }
}
