package com.capstone.swimServer.Service;

import com.capstone.swimServer.Dao.UserDao;
import com.capstone.swimServer.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    UserDao userDao;

    public String confirmLogin(String user, String pwd){
        User expectedUser = userDao.getPwdFromUsername(user);
        System.out.println(expectedUser.getPwd());
        if(expectedUser.getPwd().equals(pwd)){
            System.out.println(expectedUser.getType());
            return expectedUser.getType();
        }else{
            return "Bad Entry";
        }
    }

}
