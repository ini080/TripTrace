show databases;
use jd_galley;
CREATE DATABASE JD_Galley;

CREATE TABLE `USER_INFO` (
    `USER_TYPE` char(30) NOT NULL,
    `USER_NUM` int(10) NOT NULL AUTO_INCREMENT,
    `USER_TOKEN` char(30) DEFAULT NULL,
    `USER_AUTH` int(1) DEFAULT 1,
    `USER_ID` char(50) DEFAULT NULL,
    `USER_PW` char(20) DEFAULT NULL,
    `USER_EMAIL` char(50) DEFAULT NULL,
    `USER_STATUS` char(1) DEFAULT 'Y',
    `USER_NICKNAME` char (30) DEFAULT NULL,
    `USER_IP` CHAR (30) DEFAULT NULL,
    `USER_LOGIN_TIME` char(30) DEFAULT NULL,
    PRIMARY KEY (`USER_NUM`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE USER_IFNO;

DESC USER_INFO;

SELECT * fROM USER_INFO;
INSERT INTO USER_INFO (
USER_TYPE,USER_NUM,USER_TOKEN,USER_AUTH,USER_ID,USER_PW,USER_EMAIL,USER_STATUS,USER_NICKNAME,USER_IP,USER_LOGIN_TIME
)
VALUES(
'1',
1,
'userToken',
1,
'ini080',
'513579',
'ini080@naver.com',
'Y',
'허정건',
'localhost',
'now');


DROP TABLE Board;

CREATE TABLE `Board` (
	`SEQ` int(10) NOT NULL AUTO_INCREMENT,
    `GROUP_NAME` char(30) NOT NULL,
    `PATH` varchar(100),
    `SHOW_PICKTURE` varchar(100),
    `SHOW_DATE` varchar(30),
    `SHOW_TITLE` varchar(30),
    `SHOW_CONTENT` varchar(300),
    `SHOW_PLACE` varchar(30),
    `ORIGIN_FILE_NM` varchar(100),
    `SAVE_FILE_NM` varchar(100),
    `DEL_YN` varchar(1),
	`REG_ID` varchar(30),
    `REG_DATE` varchar(30),
    `SEQ_ORDER` int(30),
    PRIMARY KEY (`SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE ATTACH_FILE;
CREATE TABLE `ATTACH_FILE` (
	`FILE_GROUP` varchar(30) NOT NULL,
    `FILE_GROUP_SEQ` int(10),
    `FILE_SEQ` int(100) NOT NULL AUTO_INCREMENT,
    `ORIGIN_NAME` varchar(50),
	`SAVE_NAME` varchar(100),
    `PATH` varchar(100),
	`FILE_EXTENSION` varchar(10),
    `FILE_SIZE` double,
    `REG_ID` varchar(30),
    `REG_DATE` varchar(30),
    `DEL_YN` varchar(1),
	`SEQ_ORDER` int(30),
    PRIMARY KEY(FILE_SEQ)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SELECT * FROM Board;

SELECT * FROM ATTACH_FILE;

SELECT * FROM ATTACH_FILE WHERE ORIGIN_NAME = (SELECT SHOW_PICKTURE FROM BOARD WHERE SEQ = 1);