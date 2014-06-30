/*
MySQL Data Transfer
Source Host: localhost
Source Database: cptongji_db
Target Host: localhost
Target Database: cptongji_db
Date: 2014/6/30 23:25:10
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for tbl_banquanrec
-- ----------------------------
CREATE TABLE `tbl_banquanrec` (
  `recId` int(11) NOT NULL auto_increment,
  `changId` int(11) NOT NULL,
  `ss` double NOT NULL,
  `sp` double NOT NULL,
  `sf` double NOT NULL,
  `ps` double NOT NULL,
  `pp` double NOT NULL,
  `pf` double NOT NULL,
  `fs` double NOT NULL,
  `fp` double NOT NULL,
  `ff` double NOT NULL,
  `crawlTime` datetime NOT NULL,
  PRIMARY KEY  (`recId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tbl_chang
-- ----------------------------
CREATE TABLE `tbl_chang` (
  `changId` int(11) NOT NULL auto_increment,
  `hostTeamId` int(11) NOT NULL,
  `hostTeamName` varchar(30) NOT NULL,
  `guestTeamId` int(11) NOT NULL,
  `guestTeamName` varchar(30) NOT NULL,
  `matchTime` datetime NOT NULL,
  PRIMARY KEY  (`changId`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tbl_shengfurec
-- ----------------------------
CREATE TABLE `tbl_shengfurec` (
  `recId` int(11) NOT NULL auto_increment,
  `changId` int(11) NOT NULL,
  `rang` int(11) NOT NULL,
  `s` double NOT NULL,
  `p` double NOT NULL,
  `f` double NOT NULL,
  `crawlTime` datetime NOT NULL,
  PRIMARY KEY  (`recId`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tbl_team
-- ----------------------------
CREATE TABLE `tbl_team` (
  `teamId` int(11) NOT NULL auto_increment,
  `teamName` varchar(30) NOT NULL,
  `rank` int(11) NOT NULL,
  `disable` int(11) NOT NULL,
  PRIMARY KEY  (`teamId`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `tbl_chang` VALUES ('1', '6', '法国', '12', '尼日利亚', '2014-06-30 23:57:00');
INSERT INTO `tbl_chang` VALUES ('2', '2', '德国', '14', '阿尔及利亚', '2014-07-01 03:57:00');
INSERT INTO `tbl_chang` VALUES ('3', '3', '阿根廷', '8', '瑞士', '2014-07-01 23:57:00');
INSERT INTO `tbl_chang` VALUES ('4', '4', '比利时', '11', '美国', '2014-07-02 03:57:00');
INSERT INTO `tbl_chang` VALUES ('5', '1', '巴西', '7', '哥伦比亚', '2014-07-05 03:57:00');
INSERT INTO `tbl_chang` VALUES ('6', '5', '荷兰', '13', '哥斯达黎加', '2014-07-06 03:57:00');
INSERT INTO `tbl_shengfurec` VALUES ('1', '1', '0', '1.26', '4.6', '8.8', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('2', '1', '-1', '1.94', '3.45', '3.1', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('3', '2', '0', '1.2', '5.25', '10', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('4', '2', '-1', '1.7', '3.8', '3.6', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('5', '3', '0', '1.37', '3.9', '7.25', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('6', '3', '-1', '2.2', '3.5', '2.57', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('7', '4', '0', '1.77', '3.15', '4.15', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('8', '4', '-1', '3.35', '3.55', '1.82', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('9', '5', '0', '1.62', '3.45', '4.6', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('10', '5', '-1', '2.9', '3.55', '2', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('11', '6', '0', '1.35', '4', '7.5', '2014-06-30 23:17:37');
INSERT INTO `tbl_shengfurec` VALUES ('12', '6', '-1', '2.1', '3.55', '2.69', '2014-06-30 23:17:37');
INSERT INTO `tbl_team` VALUES ('1', '巴西', '16', '1');
INSERT INTO `tbl_team` VALUES ('2', '德国', '16', '1');
INSERT INTO `tbl_team` VALUES ('3', '阿根廷', '16', '1');
INSERT INTO `tbl_team` VALUES ('4', '比利时', '16', '1');
INSERT INTO `tbl_team` VALUES ('5', '荷兰', '16', '1');
INSERT INTO `tbl_team` VALUES ('6', '法国', '16', '1');
INSERT INTO `tbl_team` VALUES ('7', '哥伦比亚', '16', '1');
INSERT INTO `tbl_team` VALUES ('8', '瑞士', '16', '1');
INSERT INTO `tbl_team` VALUES ('9', '西班牙', '32', '0');
INSERT INTO `tbl_team` VALUES ('10', '意大利', '32', '0');
INSERT INTO `tbl_team` VALUES ('11', '美国', '16', '1');
INSERT INTO `tbl_team` VALUES ('12', '尼日利亚', '16', '1');
INSERT INTO `tbl_team` VALUES ('13', '哥斯达黎加', '16', '1');
INSERT INTO `tbl_team` VALUES ('14', '阿尔及利亚', '16', '1');
