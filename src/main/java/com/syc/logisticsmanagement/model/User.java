package com.syc.logisticsmanagement.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = 954510354988569828L;
    private String id;
    private String name;
    private Date register;
    private String phone;
    private String email;
    private String password;
    private String role;
    private boolean loginState;
    private boolean inService;
    private String sessionId;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
