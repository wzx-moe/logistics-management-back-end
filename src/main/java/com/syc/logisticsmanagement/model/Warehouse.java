package com.syc.logisticsmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 6561899463722822623L;
    private String warehouseID;
    private String managerID;
    private String managerName;
    private String name;
    private String location;
    private String remark;
    private String special;
    private String backup;

}
