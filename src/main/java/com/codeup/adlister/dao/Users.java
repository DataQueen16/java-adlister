package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.api.mysqla.result.Resultset;

public interface Users {
    Resultset findByUsername(String username);
    Long insert(User user);
}
