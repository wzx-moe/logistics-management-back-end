package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.annotation.UserLoginToken;
import com.syc.logisticsmanagement.mapper.UserMapper;
import com.syc.logisticsmanagement.service.SignService;
import com.syc.logisticsmanagement.service.TokenService;
import com.syc.logisticsmanagement.utils.CommonResult;
import com.syc.logisticsmanagement.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class SignController {
    private static final Logger logger = LoggerFactory.getLogger(SignController.class);

    @Autowired
    SignService signService;
    @Autowired
    TokenService tokenService;
    @Autowired
    UserMapper userMapper;


    @RequestMapping("getCurrentUser")
    @ResponseBody
    public CommonResult<User> getCurrentUser(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        return CommonResult.successReturn(userMapper.getOne(session.getAttribute("id").toString()));
    }


    @RequestMapping("login")
    @ResponseBody
    public ResponseEntity<String> userLogin(HttpSession session, HttpServletRequest request, HttpServletResponse response, @RequestBody User user) {
        String username = user.getName();
        String password = user.getPassword();
        logger.info("userLogin");
        logger.info("username: " + username);
        logger.info(password);
        Integer state = signService.checkLogin(session, request, response, username, password);
        if (state < 0) {
            return new ResponseEntity<>("用户名或密码错误", HttpStatus.NON_AUTHORITATIVE_INFORMATION);
        } else {
            String token = tokenService.getToken(userMapper.getName(username));
            return new ResponseEntity<>(token, HttpStatus.OK);
        }

    }

    @RequestMapping("/logout")
    @ResponseBody
    public CommonResult<String> logout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        signService.checkLogout(session, request, response);
        return CommonResult.successReturn("0");
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    @ResponseBody
    public String getMessage() {
        return "你已通过验证";
    }

}
