/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.25-MariaDB : Database - tgmobil
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tgmobil` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `tgmobil`;

/*Table structure for table `rentmobil` */

DROP TABLE IF EXISTS `rentmobil`;

CREATE TABLE `rentmobil` (
  `nopinjam` char(7) NOT NULL,
  `tanggalpinjam` date DEFAULT NULL,
  `namapinjam` varchar(30) DEFAULT NULL,
  `jenismobil` varchar(30) DEFAULT NULL,
  `sewaperhari` double DEFAULT NULL,
  `nopolisi` varchar(30) DEFAULT NULL,
  `lamapinjam` double DEFAULT NULL,
  `totalbayar` double DEFAULT NULL,
  PRIMARY KEY (`nopinjam`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `rentmobil` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
