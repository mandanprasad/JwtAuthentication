package com.example.schoolproject.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String email;

    public User(String string, String Name, String Email) {
        userId = string;
        name = Name;
        email = Email;

    }
}
