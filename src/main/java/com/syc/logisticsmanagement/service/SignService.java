package com.syc.logisticsmanagement.service;


import com.syc.logisticsmanagement.mapper.UserMapper;
import com.syc.logisticsmanagement.controller.SignController;
import com.syc.logisticsmanagement.model.User;
import com.syc.logisticsmanagement.utils.DateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Service
public class SignService {
    private static final String SESSION_KEY = "sessionId";
    private static final Logger logger = LoggerFactory.getLogger(SignController.class);

    @Autowired
    UserMapper userMapper;


    public String createNewSessionId(HttpServletRequest request) {
        new DateConverter();
        String datetime = DateConverter.getSimpleDateFormat().format(new Date());
        HttpSession session = request.getSession();
        session.setAttribute(SESSION_KEY, datetime);
        session.setMaxInactiveInterval(36000);
        return session.getId();
    }

    public void createNewCookie(HttpServletResponse response, String sessionId) {
        Cookie cookie = new Cookie(SESSION_KEY, sessionId);
        cookie.setMaxAge(36000);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    public boolean sessionIdIsExist(String sessionId) {
        User user = userMapper.getSessionId(sessionId);
        return user != null;
    }
    public void removeSessionId(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute(SESSION_KEY);
        session.invalidate();
    }

    public void cleanCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie(SESSION_KEY, null);
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    public String getSessionId(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (SESSION_KEY.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    public void setAttribute(HttpSession session, String username, String uid) {
        if (session == null) {
            logger.warn("session is null, username#{}, uid#{}", username, uid);
        } else {
            session.setAttribute("name", username);
            session.setAttribute("id", uid);
        }
    }

    public void removeAttribute(HttpSession session) {
        if (session != null) {
            session.removeAttribute("name");
            session.removeAttribute("id");
        }
    }

    public Integer checkLogin(HttpSession session, HttpServletRequest request, HttpServletResponse response, String userName, String passwd) {
        String sessionId = getSessionId(request);
        if (sessionId == null || !sessionIdIsExist(sessionId)) {
            sessionId = createNewSessionId(request);
            createNewCookie(response, sessionId);
        }
        User user = userMapper.getName(userName);
        if (user != null) {
            if (!user.getPassword().equals(passwd)) {
                return -1;
            }
            user.setSessionId(sessionId);
            userMapper.update(user);
            setAttribute(session, user.getName(), user.getId());
            return 0;

        }
        return -1;
    }

    public void checkLogout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        User user = userMapper.getOne(session.getAttribute("id").toString());
//        user.setLoginState(false);
        user.setSessionId(null);
        userMapper.update(user);
        removeAttribute(session);
        removeSessionId(request);
    }
}
