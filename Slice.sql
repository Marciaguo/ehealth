/*
Navicat MySQL Data Transfer

Source Server         : 服务器
Source Server Version : 5.7
Source Host           :
Source Database       : networkSlicing

Target Server Type    : MYSQL
Target Server Version : 5.7

Date: 2018-11-07 21:17:33
*/

CREATE SCHEMA `networkSlicing` DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- ----------------------------
-- Table structure for `Slice`
-- ----------------------------
CREATE TABLE `Slice` (
	`slice_id` varchar(255) NOT NULL,
	`slice_name` varchar(255) NOT NULL,
	`slice_switch` varchar(255) default null ,
	PRIMARY KEY (`slice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


