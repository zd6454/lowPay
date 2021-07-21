package com.cof.server.controller;

import com.cof.server.bean.User;
import com.cof.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    //表明这是一个get类型的请求，其余的还有post、delete等。
    @GetMapping("query")
    public List<User> query(){
        return userService.query();
    }
}
