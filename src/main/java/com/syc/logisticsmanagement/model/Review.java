package com.syc.logisticsmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Review implements Serializable {

    private static final long serialVersionUID = 616232514660313443L;
    private String reviewID;
    private String fromID;
    private String fromName;
    private String toID;
    private String toName;
    private String rating;
    private String context;
    private String date;
    private String special;
    private String backup;
}
