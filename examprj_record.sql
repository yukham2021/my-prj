-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: examprj
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `serial_no` varchar(20) NOT NULL,
  `reg_no` varchar(20) NOT NULL,
  `pt_name` varchar(25) DEFAULT NULL,
  `age` varchar(10) NOT NULL,
  `gender` varchar(25) NOT NULL,
  `new_old` varchar(10) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `diagnosis` varchar(50) NOT NULL,
  `dx_class` varchar(100) NOT NULL,
  `treatment` varchar(100) NOT NULL,
  `tx_class` varchar(100) NOT NULL,
  `precription_medication` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`reg_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
INSERT INTO `record` VALUES ('1','1111','sandar','26','F','O','chanmyatharsi','pericoronitis','Pericoronitis','excision','Surgical Treatment','para 1tds,amoxicillin 1tds,metro 1tds'),('2','2222','agag','4','M','O','sshh','periodontitis','periodontitis','scaling','other','para'),('3','3333','thiha','27','M','O','sshh','caries','injury','ELA','Other','Para'),('4','4444','win','11','M','O','mingalaroo','injury','injury','para','other','para'),('5','5555','eiei','21','M','O','ayetharyar','ulcer','Ulcer of the oral cavity','grinding','Prophylaxis','Cephalaxine 1tds'),('6','6666','zaw','66','M','O','sshh','caries','Caries','ELA','Permanent teeth Extraction','para'),('7','7777','khinkhin','27','F','N','yaeayequeen','gingivitis','Gingivitis','gross scaling','Prophylaxis','cevit 1tds'),('8','8888','myint tun','12','M','O','myo ma','caries at 21','Caries','ELA','Temporary','Amoxilin 1tds,para 1tds'),('9','9999','susu','4','F','N','sshh','injuries','Caries','ELA','Permanent teeth Extraction','para');
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-13 12:22:20
