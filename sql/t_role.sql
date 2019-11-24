/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50529
Source Host           : localhost:3306
Source Database       : springboot_demo

Target Server Type    : MYSQL
Target Server Version : 50529
File Encoding         : 65001

Date: 2019-11-03 21:00:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `rolename` varchar(30) DEFAULT NULL COMMENT '角色名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('1', '超级管理员');
INSERT INTO `t_role` VALUES ('2', '管理员');
INSERT INTO `t_role` VALUES ('3', '教师');
INSERT INTO `t_role` VALUES ('4', '学生');
INSERT INTO `t_role` VALUES ('5', '学生家长');
INSERT INTO `t_role` VALUES ('8', '教练');
