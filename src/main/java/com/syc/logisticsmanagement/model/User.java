package com.syc.logisticsmanagement.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 954510354988569828L;
    private String id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;
    private Date register;
    private String role;
    private String status;
    private String special;
    private String backup;
    private String sessionId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
