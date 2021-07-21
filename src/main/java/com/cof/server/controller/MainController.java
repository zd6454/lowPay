package com.cof.server.controller;

import com.cof.server.bean.User;
import com.cof.server.service.UserService;
import com.cof.server.utils.UserGrid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MainController {
    @Resource
    private UserService userService;

    /*查找所有用户*/
    @RequestMapping(value = "/userList")
    @ResponseBody
    public UserGrid getUserList(@RequestParam("current") int current, @RequestParam("rowCount") int rowCount) {
        int total = userService.getUserNum();
        List<User> list = userService.getPageUser(current, rowCount);
        UserGrid userGrid = new UserGrid();
        userGrid.setCurrent(current);
        userGrid.setRowCount(rowCount);
        userGrid.setRows(list);
        userGrid.setTotal(total);
        return userGrid;
    }
}