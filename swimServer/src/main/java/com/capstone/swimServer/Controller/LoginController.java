package com.capstone.swimServer.Controller;

import com.capstone.swimServer.Model.User;
import com.capstone.swimServer.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    UserService service;

    @CrossOrigin
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody String confirmLogin(@RequestBody User user) {
        return service.confirmLogin(user.getUsername(), user.getPwd());
    }


}
