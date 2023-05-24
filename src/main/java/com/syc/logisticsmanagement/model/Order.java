package com.syc.logisticsmanagement.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private static final long serialVersionUID = 1476383731773481640L;
    private String orderID;
    private String senderID;
    private String senderName;
    private String senderPhone;
    private String receiverID;
    private String receiverName;
    private String receiverPhone;
    private String driverID;
    private String driverName;
    private String status;
    private String pickupAddress;
    private String deliveryAddress;
    private String paymentMethod;
    private String orderDate;
    private String deliveryDate;
    private String insurance;
}
