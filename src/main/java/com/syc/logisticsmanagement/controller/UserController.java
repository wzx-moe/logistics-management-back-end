package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.mapper.UserMapper;
import com.syc.logisticsmanagement.model.UserVO;
import com.syc.logisticsmanagement.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = userMapper.getAll();
        return users;
    }

    @RequestMapping("/getUser")
    public User getUser(String id) {
        User user = userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/addUser")
    public void save(UserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        //user.setPhone(Integer.parseInt(userVO.getPhone()));
        user.setRegister(new Date());
        userMapper.insert(user);
    }

    @RequestMapping(value = "/updateUser")
    public void update(UserVO userVO) {
        User user = new User();
        BeanUtils.copyProperties(userVO, user);
        userMapper.update(user);
    }

//    @RequestMapping(value="/delete/{id}")
//    public void delete(@PathVariable("id") Long id) {
//    	userMapper.delete(id);
//    }


}