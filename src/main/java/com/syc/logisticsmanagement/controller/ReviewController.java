package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.annotation.UserLoginToken;
import com.syc.logisticsmanagement.mapper.ReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.syc.logisticsmanagement.utils.CommonResult;
import com.syc.logisticsmanagement.model.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/review")
public class ReviewController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    ReviewMapper reviewMapper;

    @UserLoginToken
    @RequestMapping("/getOne/{id}")
    public ResponseEntity<Review> getReview(@PathVariable String id) {
        Review review = reviewMapper.getOne(id);
        if (review != null) {
            return new ResponseEntity<>(review, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getFrom/{id}")
    public ResponseEntity<List<Review>> getReviewFrom(@PathVariable String id) {
        List<Review> reviews = reviewMapper.getFrom(id);
        if (reviews != null) {
            return new ResponseEntity<>(reviews, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getTo/{id}")
    public ResponseEntity<List<Review>> getReviewTo(@PathVariable String id) {
        List<Review> reviews = reviewMapper.getTo(id);
        if (reviews != null) {
            return new ResponseEntity<>(reviews, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getAll")
    public ResponseEntity<List<Review>> getAllReviews() {
        List<Review> reviews = reviewMapper.getAll();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/add")
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        review.setDate(new Date().toString());
        reviewMapper.insert(review);
        return new ResponseEntity<>(review, HttpStatus.CREATED);
    }

    @UserLoginToken
    @RequestMapping("/update/{id}")
    public ResponseEntity<Review> updateReview(@PathVariable String id, @RequestBody Review review) {
        review.setReviewID(id);
        reviewMapper.update(review);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }
}
