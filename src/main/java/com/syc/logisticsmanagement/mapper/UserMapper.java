package com.syc.logisticsmanagement.mapper;

import com.syc.logisticsmanagement.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface UserMapper {


    @Select("SELECT * FROM Users")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    List<User> getAll();

    @Select("SELECT * FROM Users WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    User getOne(String id);

    @Select("SELECT * FROM Users WHERE name = #{name}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    User getName(String name);

    @Select("SELECT * FROM Users WHERE session_id = #{sessionId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    User getSessionId(String id);

    @Select("SELECT * FROM Users WHERE role = 'driver'")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    List<User> getDriver();

    @Select("SELECT * FROM Users WHERE role = 'warehouse'")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    List<User> getWarehouse();

    @Select("SELECT * FROM Users WHERE role = 'customer-service'")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "address", column = "address"),
            @Result(property = "password", column = "password"),
            @Result(property = "register", column = "register"),
            @Result(property = "role", column = "role"),
            @Result(property = "status", column = "status"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup"),
            @Result(property = "sessionId", column = "session_id")
    })
    List<User> getCustomerService();

    @Insert("INSERT INTO Users(name, phone, email, address, password, register, role) VALUES(#{name}, #{phone}, #{email}, #{address}, #{password}, #{register}, #{role})")
    void insert(User user);

    @Update("UPDATE Users SET name=#{name}, phone=#{phone}, email=#{email}, address=#{address}, password=#{password}, status=#{status}, special=#{special}, backup=#{backup}, session_id=#{sessionId} WHERE id =#{id}")
    void update(User user);


}
