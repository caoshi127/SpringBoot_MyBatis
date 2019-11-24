/*
Navicat MySQL Data Transfer

Source Server         : conn
Source Server Version : 50529
Source Host           : localhost:3306
Source Database       : springboot_demo

Target Server Type    : MYSQL
Target Server Version : 50529
File Encoding         : 65001

Date: 2019-11-03 21:00:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `gender` varchar(5) DEFAULT NULL COMMENT '性别',
  `address` varchar(30) DEFAULT NULL COMMENT '地址',
  `roleid` int(10) DEFAULT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1008 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1001', '张三', '男', '湖南', '1');
INSERT INTO `t_user` VALUES ('1002', '李四', '女', '湖北', '2');
INSERT INTO `t_user` VALUES ('1003', '王五', '男', '北京', '3');
INSERT INTO `t_user` VALUES ('1004', '赵六', '男', '上海', '2');
INSERT INTO `t_user` VALUES ('1005', '孙悟空', '男', '西天', '2');
INSERT INTO `t_user` VALUES ('1006', '沙悟净', '男', '西天', '3');
