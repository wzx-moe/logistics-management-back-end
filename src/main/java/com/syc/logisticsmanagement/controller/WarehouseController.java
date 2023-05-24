package com.syc.logisticsmanagement.controller;

import com.syc.logisticsmanagement.annotation.UserLoginToken;
import com.syc.logisticsmanagement.mapper.WarehouseMapper;
import com.syc.logisticsmanagement.model.Warehouse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Resource
    private WarehouseMapper warehouseMapper;

    @UserLoginToken
    @RequestMapping("/gatOne/{id}")
    public ResponseEntity<Warehouse> getWarehouse(@PathVariable String id) {
        Warehouse warehouse = warehouseMapper.getOne(id);
        if (warehouse != null) {
            return new ResponseEntity<>(warehouse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getManager/{id}")
    public ResponseEntity<List<Warehouse>>  getWarehouseManager(@PathVariable String id) {
        List<Warehouse> warehouses = warehouseMapper.getManager(id);
        if (warehouses != null) {
            return new ResponseEntity<>(warehouses, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @UserLoginToken
    @RequestMapping("/getAll")
    public ResponseEntity<List<Warehouse>> getAllWarehouses() {
        List<Warehouse> warehouses = warehouseMapper.getAll();
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }

    @UserLoginToken
    @RequestMapping("/add")
    public ResponseEntity<Warehouse> createWarehouse(@RequestBody Warehouse warehouse) {
        warehouseMapper.insert(warehouse);
        return new ResponseEntity<>(warehouse, HttpStatus.CREATED);
    }

    @UserLoginToken
    @RequestMapping("/update/{id}")
    public ResponseEntity<Warehouse> updateWarehouse(@PathVariable String id, @RequestBody Warehouse warehouse) {
        warehouse.setWarehouseID(id);
        warehouseMapper.update(warehouse);
        return new ResponseEntity<>(warehouse, HttpStatus.OK);
    }

}
