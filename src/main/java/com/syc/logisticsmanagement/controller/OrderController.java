package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.annotation.UserLoginToken;
import com.syc.logisticsmanagement.mapper.OrderMapper;
import com.syc.logisticsmanagement.mapper.WarehouseMapper;
import com.syc.logisticsmanagement.model.Order;
import com.syc.logisticsmanagement.utils.CommonResult;
import com.syc.logisticsmanagement.model.Warehouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    OrderMapper orderMapper;


    @RequestMapping("/getOne/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable String id) {
        Order order = orderMapper.getOne(id);
        if (order != null) {
            return new ResponseEntity<>(order, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getSenderID/{id}")
    public ResponseEntity<List<Order>>getSenderID(@PathVariable String id) {
        List<Order> orders = orderMapper.getSenderID(id);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getSenderName/{name}")
    public ResponseEntity<List<Order>>getSenderName(@PathVariable String name) {
        List<Order> orders = orderMapper.getSenderName(name);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getReceiverID/{id}")
    public ResponseEntity<List<Order>>getReceiverID(@PathVariable String id) {
        List<Order> orders = orderMapper.getReceiverID(id);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getReceiverName/{name}")
    public ResponseEntity<List<Order>>getReceiverName(@PathVariable String name) {
        List<Order> orders = orderMapper.getReceiverName(name);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getDriverID/{id}")
    public ResponseEntity<List<Order>>getDriverID(@PathVariable String id) {
        List<Order> orders = orderMapper.getDriverID(id);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getDriverName/{name}")
    public ResponseEntity<List<Order>>getDriverName(@PathVariable String name) {
        List<Order> orders = orderMapper.getDriverName(name);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getDriverIDPending/{id}")
    public ResponseEntity<List<Order>>getDriverIDPending(@PathVariable String id) {
        List<Order> orders = orderMapper.getDriverIDPending(id);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getDriverIDCompleted/{id}")
    public ResponseEntity<List<Order>>getDriverIDCompleted(@PathVariable String id) {
        List<Order> orders = orderMapper.getDriverIDCompleted(id);
        if (orders != null) {
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getPending")
    public ResponseEntity<List<Order>> getPending() {
        List<Order> orders = orderMapper.getPending();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/getCompleted")
    public ResponseEntity<List<Order>> getCompleted() {
        List<Order> orders = orderMapper.getCompleted();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/getAll")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderMapper.getAll();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/add")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        order.setStatus("待处理");
        orderMapper.insert(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @UserLoginToken
    @RequestMapping("/update/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable String id, @RequestBody Order order) {
        order.setOrderID(id);
        orderMapper.update(order);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }
}
