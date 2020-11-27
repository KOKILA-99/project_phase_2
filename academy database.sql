-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: academy
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Dumping data for table `class_table`
--

LOCK TABLES `class_table` WRITE;
/*!40000 ALTER TABLE `class_table` DISABLE KEYS */;
INSERT INTO `class_table` VALUES (1,'S101','English',1),(1,'S102','Tamil',3),(1,'S103','Mathematics',5),(1,'S104','Science',4),(1,'S105','Hindi',9),(2,'S201','English',2),(2,'S202','Tamil',3),(2,'S203','Mathematics',5),(2,'S204','Science',6),(2,'S205','Hindi',10),(2,'S206','Yoga',7),(1,'S106','Yoga',8),(3,'S301','English',11),(3,'S302','Tamil',3),(3,'S303','Mathematics',12),(3,'S304','Science',4),(3,'S305','Hindi',10),(4,'S401','English',14),(4,'S402','Tamil',13),(4,'S403','Mathematics',12),(4,'S404','Science',15),(4,'S405','Hindi',16),(4,'S406','Arts and Crafts',17),(5,'S501','English',14),(5,'S502','Tamil',13),(5,'S503','Mathematics',18),(5,'S504','Science',15),(5,'S505','Hindi',16),(5,'S506','Arts and Crafts',17);
/*!40000 ALTER TABLE `class_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (101,'Ajith',1),(102,'Asmi',1),(103,'Dharani',1),(104,'Jeevitha',1),(105,'Kalyani',1),(106,'Kokila',1),(107,'Mani',1),(108,'Sakthi',1),(201,'Aarthi',2),(202,'Ashok',2),(203,'Binu',2),(204,'Dinesh',2),(205,'Elango',2),(206,'Mathi',2),(207,'Priya',2),(208,'Suriya',2),(301,'Ajith',3),(302,'Arun',3),(303,'Deepak',3),(401,'Kiruthika',4),(402,'Lakshmi',4),(403,'Rohit',4),(404,'Vikram',4),(501,'Aravind',5),(502,'Bala',5),(503,'Elizabeth',5),(504,'Gokul',5),(505,'Krishna',5),(506,'Veni',5);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'James'),(2,'Martin'),(3,'Devi'),(4,'Aswini'),(5,'Rajendran'),(6,'Selvi'),(7,'Steve'),(8,'Tony'),(9,'Bruce'),(10,'Pattinson'),(11,'Sathya'),(12,'Kannan'),(13,'Lokesh'),(14,'Nivedha'),(15,'Ramya'),(16,'Meena'),(17,'Saranya'),(18,'Suresh');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-27 12:39:56
