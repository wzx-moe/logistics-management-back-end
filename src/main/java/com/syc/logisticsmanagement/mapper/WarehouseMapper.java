package com.syc.logisticsmanagement.mapper;

import com.syc.logisticsmanagement.model.Warehouse;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface WarehouseMapper {
    @Select("SELECT * FROM Warehouses")
    @Results({
            @Result(property = "warehouseID", column = "warehouse_id"),
            @Result(property = "managerID", column = "manager_id"),
            @Result(property = "managerName", column = "manager_name"),
            @Result(property = "name", column = "name"),
            @Result(property = "location", column = "location"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    List<Warehouse> getAll();

    @Select("SELECT * FROM Warehouses WHERE warehouse_id = #{id}")
    @Results({
            @Result(property = "warehouseID", column = "warehouse_id"),
            @Result(property = "managerID", column = "manager_id"),
            @Result(property = "managerName", column = "manager_name"),
            @Result(property = "name", column = "name"),
            @Result(property = "location", column = "location"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    Warehouse getOne(@Param("id") String id);

    @Select("SELECT * FROM Warehouses WHERE manager_id = #{id}")
    @Results({
            @Result(property = "warehouseID", column = "warehouse_id"),
            @Result(property = "managerID", column = "manager_id"),
            @Result(property = "managerName", column = "manager_name"),
            @Result(property = "name", column = "name"),
            @Result(property = "location", column = "location"),
            @Result(property = "remark", column = "remark"),
            @Result(property = "special", column = "special"),
            @Result(property = "backup", column = "backup")
    })
    List<Warehouse> getManager(@Param("id") String id);

    @Insert("INSERT INTO Warehouses(manager_id, manager_name, name, location, remark, special, backup) VALUES(#{managerID}, #{managerName}, #{name}, #{location}, #{remark}, #{special}, #{backup})")
    @Options(useGeneratedKeys = true, keyProperty = "warehouseID")
    int insert(Warehouse warehouse);

    @Update("UPDATE Warehouses SET manager_id=#{managerID}, manager_name=#{managerName}, name=#{name}, location=#{location}, remark=#{remark}, special=#{special}, backup=#{backup} WHERE warehouse_id=#{warehouseID}")
    void update(Warehouse warehouse);

}

