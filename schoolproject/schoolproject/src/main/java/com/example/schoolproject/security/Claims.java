package com.example.schoolproject.security;

import java.util.Date;

public class Claims {
    public Date getExpiration() {
        return new Date();
    }

    public Date getSubject() {
        return getExpiration();
    }
}
