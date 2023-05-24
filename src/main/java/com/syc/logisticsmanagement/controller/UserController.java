package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.annotation.UserLoginToken;
import com.syc.logisticsmanagement.mapper.UserMapper;
import com.syc.logisticsmanagement.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @UserLoginToken
    @RequestMapping("/getOne/{id}")
    public ResponseEntity<User> getUser(@PathVariable String id) {
        User user = userMapper.getOne(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getName/{name}")
    public ResponseEntity<User> getOwnUser(@PathVariable String name) {
        User user = userMapper.getName(name);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getDriver")
    public ResponseEntity<List<User>> getDriver() {
        List<User> users = userMapper.getDriver();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/getWarehouse")
    public ResponseEntity<List<User>> getWarehouse() {
        List<User> users = userMapper.getWarehouse();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/getCustomerService")
    public ResponseEntity<List<User>> getCustomerService() {
        List<User> users = userMapper.getCustomerService();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/getAll")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userMapper.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        user.setRegister(new Date());
        userMapper.insert(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @UserLoginToken
    @RequestMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        userMapper.update(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }


}