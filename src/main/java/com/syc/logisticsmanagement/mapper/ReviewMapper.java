package com.syc.logisticsmanagement.mapper;

import com.syc.logisticsmanagement.model.Review;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface ReviewMapper {
    @Select("SELECT * FROM Reviews")
    @Results({
            @Result(property = "reviewID", column = "review_id", id = true),
            @Result(property = "fromID", column = "from_id"),
            @Result(property = "fromName", column = "from_name"),
            @Result(property = "toName", column = "to_name"),
            @Result(property = "toID", column = "to_id"),
            @Result(property = "rating", column = "rating"),
            @Result(property = "context", column = "context"),
            @Result(property = "date", column = "date"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    List<Review> getAll();

    @Select("SELECT * FROM Reviews WHERE review_id = #{id}")
    @Results({
            @Result(property = "reviewID", column = "review_id", id = true),
            @Result(property = "fromID", column = "from_id"),
            @Result(property = "fromName", column = "from_name"),
            @Result(property = "toName", column = "to_name"),
            @Result(property = "toID", column = "to_id"),
            @Result(property = "rating", column = "rating"),
            @Result(property = "context", column = "context"),
            @Result(property = "date", column = "date"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    Review getOne(@Param("id") String id);

    @Select("SELECT * FROM Reviews WHERE from_id = #{id}")
    @Results({
            @Result(property = "reviewID", column = "review_id", id = true),
            @Result(property = "fromID", column = "from_id"),
            @Result(property = "fromName", column = "from_name"),
            @Result(property = "toName", column = "to_name"),
            @Result(property = "toID", column = "to_id"),
            @Result(property = "rating", column = "rating"),
            @Result(property = "context", column = "context"),
            @Result(property = "date", column = "date"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    List<Review> getFrom(@Param("id") String id);

    @Select("SELECT * FROM Reviews WHERE to_id = #{id}")
    @Results({
            @Result(property = "reviewID", column = "review_id", id = true),
            @Result(property = "fromID", column = "from_id"),
            @Result(property = "fromName", column = "from_name"),
            @Result(property = "toName", column = "to_name"),
            @Result(property = "toID", column = "to_id"),
            @Result(property = "rating", column = "rating"),
            @Result(property = "context", column = "context"),
            @Result(property = "date", column = "date"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    List<Review> getTo(@Param("id") String id);

    @Insert("INSERT INTO Reviews(from_id, from_name, to_name,  to_id, rating, context, date, special, backup) VALUES(#{fromID}, #{fromName}, #{toName}, #{toID}, #{rating}, #{context}, #{date}, #{special}, #{backup})")
    int insert(Review review);

    @Update("UPDATE Reviews SET from_id=#{fromID},  from_name=#{fromName}, to_name=#{toName}, to_id=#{toID}, rating=#{rating}, context=#{context}, date=#{date}, special=#{special}, backup=#{backup} WHERE review_id=#{reviewID}")
    int update(Review review);

}
