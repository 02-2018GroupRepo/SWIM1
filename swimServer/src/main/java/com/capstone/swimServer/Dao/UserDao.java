package com.capstone.swimServer.Dao;

import com.capstone.swimServer.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String confirmLogin = "SELECT * FROM user WHERE username = ?";

    public User getPwdFromUsername(String username){
        List<User> expectedPassword = jdbcTemplate.query(confirmLogin, new Object[] {username}, new BeanPropertyRowMapper(User.class));
        return expectedPassword.get(0);

    }
}
