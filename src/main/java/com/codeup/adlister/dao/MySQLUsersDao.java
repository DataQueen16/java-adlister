package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.api.mysqla.result.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLUsersDao implements Users{
    @Override
    public Resultset findByUsername(String username) {
//        Take in value
        Connection connection = null;
        try {
            String sql = "SELECT * FROM users WHERE username LIKE ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            Resultset rs = (Resultset) stmt.executeQuery();

            if (rs.equals(username)){
                return rs;
            } else {
                System.out.println(username + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return null;
    }

    @Override
    public Long insert(User user) {
        int numberOfRounds = 12;
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(numberOfRounds));
//        Take in value
//        Format String/hash it
//        Insert into database
//        Use preparedStatement
        return null;
    }
}
