package com.syc.logisticsmanagement.mapper;

import com.syc.logisticsmanagement.model.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    @Select("SELECT * FROM Orders")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getAll();

    @Select("SELECT * FROM Orders WHERE order_id = #{id}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    Order getOne(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE sender_id = #{id}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getSenderID(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE sender_name = #{name}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getSenderName(@Param("name") String name);

    @Select("SELECT * FROM Orders WHERE receiver_id = #{id}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getReceiverID(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE receiver_name = #{name}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getReceiverName(@Param("name") String name);

    @Select("SELECT * FROM Orders WHERE driver_id = #{id}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getDriverID(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE driver_name = #{name}")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getDriverName(@Param("nmae") String name);

    @Select("SELECT * FROM Orders WHERE driver_id = #{id} AND status = '待处理'")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getDriverIDPending(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE driver_id = #{id} AND status != '待处理'")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getDriverIDCompleted(@Param("id") String id);

    @Select("SELECT * FROM Orders WHERE driver_id IS NULL")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getPending();

    @Select("SELECT * FROM Orders WHERE driver_id IS NOT NULL")
    @Results({
            @Result(property = "orderID", column = "order_id"),
            @Result(property = "senderID", column = "sender_id"),
            @Result(property = "senderName", column = "sender_name"),
            @Result(property = "senderPhone", column = "sender_phone"),
            @Result(property = "receiverID", column = "receiver_id"),
            @Result(property = "receiverName", column = "receiver_name"),
            @Result(property = "receiverPhone", column = "receiver_phone"),
            @Result(property = "driverID", column = "driver_id"),
            @Result(property = "driverName", column = "driver_name"),
            @Result(property = "status", column = "status"),
            @Result(property = "pickupAddress", column = "pickup_address"),
            @Result(property = "deliveryAddress", column = "delivery_address"),
            @Result(property = "paymentMethod", column = "payment_method"),
            @Result(property = "orderDate", column = "order_date"),
            @Result(property = "deliveryDate", column = "delivery_date"),
            @Result(property = "insurance", column = "insurance")
    })
    List<Order> getCompleted();

    @Insert("INSERT INTO Orders(order_id, sender_id, sender_name, sender_phone, receiver_id, receiver_name, receiver_phone, driver_id, driver_name, status, pickup_address, delivery_address, payment_method, order_date, delivery_date, insurance) VALUES(#{orderID}, #{senderID}, #{senderName}, #{senderPhone}, #{receiverID}, #{receiverName}, #{receiverPhone}, #{driverID}, #{driverName}, #{status}, #{pickupAddress}, #{deliveryAddress}, #{paymentMethod}, #{orderDate}, #{deliveryDate}, #{insurance})")
    @Options(useGeneratedKeys = true, keyProperty = "orderID")
    void insert(Order order);

    @Update("UPDATE Orders SET sender_id=#{senderID}, sender_name=#{senderName}, sender_phone=#{senderPhone}, receiver_id=#{receiverID}, receiver_name=#{receiverName}, receiver_phone=#{receiverPhone}, driver_id=#{driverID}, driver_name=#{driverName}, status=#{status}, pickup_address=#{pickupAddress}, delivery_address=#{deliveryAddress}, payment_method=#{paymentMethod}, order_date=#{orderDate}, delivery_date=#{deliveryDate}, insurance=#{insurance} WHERE order_id=#{orderID}")
    void update(Order order);

}

