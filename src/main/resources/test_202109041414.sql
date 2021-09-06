﻿--
-- Script was generated by Devart dbForge Studio 2020 for MySQL, Version 9.0.338.0
-- Product home page: http://www.devart.com/dbforge/mysql/studio
-- Script date 9/4/2021 2:14:16 PM
-- Server version: 5.7.32
-- Client version: 4.1
--

-- 
-- Disable foreign keys
-- 
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;

-- 
-- Set SQL mode
-- 
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 
-- Set character set the client will use to send SQL statements to the server
--
SET NAMES 'utf8';

--
-- Set default database
--
USE test;

--
-- Drop table `class`
--
DROP TABLE IF EXISTS class;

--
-- Drop table `user`
--
DROP TABLE IF EXISTS user;

--
-- Set default database
--
USE test;

--
-- Create table `user`
--
CREATE TABLE user (
  did int(11) NOT NULL,
  dname varchar(255) DEFAULT NULL,
  grade_id int(11) DEFAULT NULL,
  PRIMARY KEY (did)
)
ENGINE = INNODB,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

--
-- Create table `class`
--
CREATE TABLE grade (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) DEFAULT NULL,
  PRIMARY KEY (id)
)
ENGINE = INNODB,
CHARACTER SET utf8,
COLLATE utf8_general_ci;

-- 
-- Dumping data for table user
--
-- Table test.user does not contain any data (it is empty)

-- 
-- Dumping data for table class
--
-- Table test.class does not contain any data (it is empty)

-- 
-- Restore previous SQL mode
-- 
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

-- 
-- Enable foreign keys
-- 
/*!40014 SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS */;