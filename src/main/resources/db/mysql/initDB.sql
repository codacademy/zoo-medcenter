CREATE DATABASE IF NOT EXISTS zoomedcenter;

ALTER DATABASE zoomedcenter
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON zoomedcenter.* TO root@localhost IDENTIFIED BY 'root';

USE zoomedcenter;

CREATE TABLE IF NOT EXISTS users(
  username VARCHAR(20) NOT NULL ,
  password VARCHAR (20) NOT NULL ,
  enabled TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (username)
) engine=InnoDB;