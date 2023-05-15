package com.syc.logisticsmanagement.mapper;

import com.syc.logisticsmanagement.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {

    @Select("SELECT * FROM userDtl")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "register", column = "register"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "role", column = "role"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "loginState", column = "loginState"),
            @Result(property = "inService", column = "inService"),
            @Result(property = "sessionId", column = "sessionId")
    })
    List<User> getAll();

    @Select("SELECT * FROM userDtl WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "register", column = "register"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "role", column = "role"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "loginState", column = "loginState"),
            @Result(property = "inService", column = "inService"),
            @Result(property = "sessionId", column = "sessionId")
    })
    User getOne(String id);

    @Insert("INSERT INTO userDtl(id,name,password,email, phone, register) VALUES(#{id}, #{name}, #{password}, #{email}, #{phone}), #{register})")
    void insert(User user);

    @Update("UPDATE userDtl SET phone=#{phone} email=#{email}, password=#{password}, loginState=#{loginState}, inService=#{inService}, sessionId=#{sessionId}, name=#{name} WHERE id =#{id}")
    void update(User user);


}
