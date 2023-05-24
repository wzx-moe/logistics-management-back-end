-- MySQL dump 10.13  Distrib 8.0.33, for macos13.3 (arm64)
--
-- Host: localhost    Database: logistics_management_db
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

CREATE DATABASE `logistics_management_db`;
USE `logistics_management_db`;

--
-- Table structure for table `Orders`
--

DROP TABLE IF EXISTS `Orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Orders` (
  `order_id` int NOT NULL AUTO_INCREMENT,
  `sender_id` char(50) DEFAULT NULL,
  `sender_name` char(50) DEFAULT NULL,
  `sender_phone` char(50) DEFAULT NULL,
  `receiver_id` char(50) DEFAULT NULL,
  `receiver_name` char(50) DEFAULT NULL,
  `receiver_phone` char(50) DEFAULT NULL,
  `driver_id` char(50) DEFAULT NULL,
  `driver_name` char(50) DEFAULT NULL,
  `status` char(50) DEFAULT NULL,
  `pickup_address` char(100) DEFAULT NULL,
  `delivery_address` char(100) DEFAULT NULL,
  `payment_method` char(50) DEFAULT NULL,
  `order_date` char(50) DEFAULT NULL,
  `delivery_date` char(50) DEFAULT NULL,
  `insurance` char(50) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=800016 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Orders`
--

LOCK TABLES `Orders` WRITE;
/*!40000 ALTER TABLE `Orders` DISABLE KEYS */;
INSERT INTO `Orders` VALUES (800001,'1001','庄璐璐','13501234567',NULL,'林夕','13562345678','1006','刘文杰','待取件','南京市鼓楼区','南京市秦淮区','寄付现结','2023-05-20T12:45:00','2023-05-23','是'),(800002,'1001','庄璐璐','13501234567','1003','许泽坤','13521234569',NULL,NULL,'待处理','南京市鼓楼区','南京市浦口区','货到付款','2023-05-21T13:35:00','2023-05-24','否'),(800003,'1001','庄璐璐','13501234567',NULL,'江南','13571234560','1006','刘文杰','待取件','南京市鼓楼区','南京市建邺区','寄付现结','2023-05-22T09:15:00','2023-05-25','是'),(800004,'1001','庄璐璐','13501234567',NULL,'白洛基','13581234561',NULL,NULL,'待处理','南京市鼓楼区','南京市栖霞区','货到付款','2023-05-23T10:05:00','2023-05-26','否'),(800005,'1001','庄璐璐','13501234567','1002','薛茹耘','13511234568','1006','刘文杰','待处理','南京市鼓楼区','南京市秦淮区','寄付现结','2023-05-20T16:20:00','2023-05-23','是'),(800006,'1001','庄璐璐','13501234567',NULL,'方兰生','13591234562','1002',NULL,'待处理','南京市鼓楼区','南京市浦口区','货到付款','2023-05-21T14:30:00','2023-05-24','否'),(800007,'1001','庄璐璐','13501234567','1005','沙昱成','13541234561','1006','刘文杰','待处理','南京市鼓楼区','南京市建邺区','寄付现结','2023-05-22T11:40:00','2023-05-25','是'),(800008,'1001','庄璐璐','13501234567',NULL,'花千骨','13510234563','1002','薛茹耘','待取件','南京市鼓楼区','南京市栖霞区','货到付款','2023-05-23T15:50:00','2023-05-26','否'),(800009,'1001','庄璐璐','13501234567','1004','张和','13531234560',NULL,NULL,'待处理','南京市鼓楼区','南京市秦淮区','寄付现结','2023-05-20T17:30:00','2023-05-23','是'),(800010,'1001','庄璐璐','13501234567','1005','沙昱成','13541234561','1002','薛茹耘','待处理','南京市鼓楼区','南京市建邺区','货到付款','2023-05-21T08:40:00','2023-05-24','否'),(800011,'1001','庄璐璐','13501234567','1003','许泽坤','13521234569','1006','刘文杰','待取件','南京市鼓楼区','南京市建邺区','寄付现结','2023-05-22T19:50:00','2023-05-25','是'),(800012,'1001','庄璐璐','13501234567',NULL,'姚瑶','13540234565',NULL,NULL,'待处理','南京市鼓楼区','南京市栖霞区','货到付款','2023-05-23T07:00:00','2023-05-26','否'),(800013,'1001','庄璐璐','13501234567','1002','薛茹耘','13511234568',NULL,NULL,'待处理','南京市鼓楼区','南京市秦淮区','寄付现结','2023-05-20T20:10:00','2023-05-23','是'),(800014,'1001','庄璐璐','13501234567',NULL,'素素','13550234566','1002','薛茹耘','待取件','南京市鼓楼区','南京市浦口区','货到付款','2023-05-21T10:20:00','2023-05-24','否'),(800015,'1001','庄璐璐','13501234567','1004','张和','13531234560','1006','刘文杰','待处理','南京市鼓楼区','南京市建邺区','寄付现结','2023-05-22T11:30:00','2023-05-25','是');
/*!40000 ALTER TABLE `Orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reviews`
--

DROP TABLE IF EXISTS `Reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Reviews` (
  `review_id` int NOT NULL AUTO_INCREMENT,
  `from_id` int DEFAULT NULL,
  `from_name` char(50) DEFAULT NULL,
  `to_id` int DEFAULT NULL,
  `to_name` char(50) DEFAULT NULL,
  `rating` char(50) DEFAULT NULL,
  `context` char(255) DEFAULT NULL,
  `date` char(50) DEFAULT NULL,
  `special` char(50) DEFAULT NULL,
  `backup` char(50) DEFAULT NULL,
  PRIMARY KEY (`review_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reviews`
--

LOCK TABLES `Reviews` WRITE;
/*!40000 ALTER TABLE `Reviews` DISABLE KEYS */;
INSERT INTO `Reviews` VALUES (10001,1001,'庄璐璐',1006,'刘文杰','5','非常满意，服务周到，准时送达。','Wed May 24 22:19:03 AEST 2023',NULL,NULL),(10002,1001,'庄璐璐',1002,'薛茹耘','4','服务不错，稍微有点晚，但总体满意。','Wed May 24 22:19:23 AEST 2023',NULL,NULL),(10003,1001,'庄璐璐',1006,'刘文杰','4.5','很好，非常满意，下次还会选择。','Wed May 24 22:19:30 AEST 2023',NULL,NULL),(10004,1001,'庄璐璐',1002,'薛茹耘','3.5','服务一般，希望下次可以更快。','Wed May 24 22:19:41 AEST 2023',NULL,NULL),(10005,1001,'庄璐璐',1006,'刘文杰','4.8','非常满意，服务态度好，速度快。','Wed May 24 22:19:49 AEST 2023',NULL,NULL);
/*!40000 ALTER TABLE `Reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` char(50) DEFAULT NULL,
  `password` char(50) DEFAULT NULL,
  `email` char(50) DEFAULT NULL,
  `phone` char(50) DEFAULT NULL,
  `address` char(50) DEFAULT NULL,
  `register` char(50) DEFAULT NULL,
  `role` char(50) DEFAULT NULL,
  `status` char(50) DEFAULT NULL,
  `special` char(50) DEFAULT NULL,
  `backup` char(50) DEFAULT NULL,
  `session_id` char(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
INSERT INTO `Users` VALUES (1001,'庄璐璐','123456','zhuanglulu@mail.com','13501234567',NULL,'2023-05-23 13:12:45.986','customer',NULL,NULL,NULL,'054D96552DFE7D118E05DC9A0169DB99'),(1002,'薛茹耘','123456','xueruyun@mail.com','13511234568','南京市鼓楼区','2023-05-23 13:13:09.118','driver','忙碌','3.5',NULL,'6E98D67885A318AF0982B4221E2415D0'),(1003,'许泽坤','123456','xuzekun@mail.com','13521234569','南京市秦淮区','2023-05-23 13:13:38.103','warehouse','忙碌','4.1',NULL,'EE96A080F4B3381854101EE68AF48163'),(1004,'张和','123456','zhanghe@mail.com','13531234560','南京市江宁区','2023-05-23 13:13:58.498','customer-service','空闲','4.7',NULL,NULL),(1005,'沙昱成','123456','shayucheng@mail.com','13541234561',NULL,'2023-05-23 13:14:13.955','manager',NULL,NULL,NULL,NULL),(1006,'刘文杰','123456','liuwenjie@mail.com','13551234562','南京市浦口区','2023-05-23 13:14:56.578','driver','空闲','4.3',NULL,'49472AA6C76C73C1FDF8B4CAF05CD190');
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Warehouses`
--

DROP TABLE IF EXISTS `Warehouses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Warehouses` (
  `warehouse_id` int NOT NULL AUTO_INCREMENT,
  `manager_id` int DEFAULT NULL,
  `manager_name` char(50) DEFAULT NULL,
  `name` char(50) DEFAULT NULL,
  `location` char(100) DEFAULT NULL,
  `remark` char(50) DEFAULT NULL,
  `special` char(50) DEFAULT NULL,
  `backup` char(50) DEFAULT NULL,
  PRIMARY KEY (`warehouse_id`)
) ENGINE=InnoDB AUTO_INCREMENT=900006 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Warehouses`
--

LOCK TABLES `Warehouses` WRITE;
/*!40000 ALTER TABLE `Warehouses` DISABLE KEYS */;
INSERT INTO `Warehouses` VALUES (9000001,1005,'沙昱成','南京仓库一','南京市江宁区','主要负责南京市区的货物储存',NULL,NULL),(9000002,1005,'沙昱成','南京仓库二','南京市建邺区','主要负责南京市北部的货物储存',NULL,NULL),(9000003,1005,'沙昱成','南京仓库三','南京市鼓楼区','主要负责南京市南部的货物储存',NULL,NULL),(9000004,1005,'沙昱成','南京仓库四','南京市浦口区','主要负责南京市西部的货物储存',NULL,NULL),(9000005,1005,'沙昱成','南京仓库五','南京市栖霞区','主要负责南京市东部的货物储存',NULL,NULL);
/*!40000 ALTER TABLE `Warehouses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-24 22:26:01

CREATE USER 'syc'@'localhost' IDENTIFIED BY 'shayucheng21@gmail.com';
GRANT ALL PRIVILEGES ON logistics_management_db.* TO 'syc'@localhost;
