package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLUsersDao implements Users{
    @Override
    public User findByUsername(String username) {
//        Take in value
        Connection connection = null;
        String sql = "SELECT * FROM users WHERE username = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
//        compare value to database
//        return result
        return null;
    }

    @Override
    public Long insert(User user) {
//        Take in value
//        Format String/hash it
//        Insert into database
//        Use preparedStatement
        return null;
    }
}
