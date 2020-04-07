/*
Navicat MySQL Data Transfer

Source Server         : io
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2020-04-07 21:25:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=76 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王元法', '123456');
INSERT INTO `user` VALUES ('2', '张甲', 'zhangjia');
INSERT INTO `user` VALUES ('3', '张甲', '545');
INSERT INTO `user` VALUES ('5', '6', '1');
INSERT INTO `user` VALUES ('6', 'es', '897');
INSERT INTO `user` VALUES ('7', 'es', '897');
INSERT INTO `user` VALUES ('8', 'es', '897');
INSERT INTO `user` VALUES ('67', 'es', '');
INSERT INTO `user` VALUES ('70', '啊', '45');
INSERT INTO `user` VALUES ('75', '1', '2');
