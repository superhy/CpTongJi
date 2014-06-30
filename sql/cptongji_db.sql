-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- 主机: localhost
-- 生成日期: 2014 年 06 月 30 日 12:02
-- 服务器版本: 5.0.45
-- PHP 版本: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- 数据库: `cptongji_db`
-- 

-- --------------------------------------------------------

-- 
-- 表的结构 `tbl_banquanrec`
-- 

DROP TABLE IF EXISTS `tbl_banquanrec`;
CREATE TABLE IF NOT EXISTS `tbl_banquanrec` (
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
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- 导出表中的数据 `tbl_banquanrec`
-- 


-- --------------------------------------------------------

-- 
-- 表的结构 `tbl_chang`
-- 

DROP TABLE IF EXISTS `tbl_chang`;
CREATE TABLE IF NOT EXISTS `tbl_chang` (
  `changId` int(11) NOT NULL auto_increment,
  `hostTeamId` int(11) NOT NULL,
  `hostTeamName` varchar(30) NOT NULL,
  `guestTeamId` int(11) NOT NULL,
  `guestTeamName` varchar(30) NOT NULL,
  `matchTime` datetime NOT NULL,
  PRIMARY KEY  (`changId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- 导出表中的数据 `tbl_chang`
-- 


-- --------------------------------------------------------

-- 
-- 表的结构 `tbl_shengfurec`
-- 

DROP TABLE IF EXISTS `tbl_shengfurec`;
CREATE TABLE IF NOT EXISTS `tbl_shengfurec` (
  `recId` int(11) NOT NULL auto_increment,
  `changId` int(11) NOT NULL,
  `rang` int(11) NOT NULL,
  `s` double NOT NULL,
  `p` double NOT NULL,
  `f` double NOT NULL,
  `crawlTime` datetime NOT NULL,
  PRIMARY KEY  (`recId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- 导出表中的数据 `tbl_shengfurec`
-- 


-- --------------------------------------------------------

-- 
-- 表的结构 `tbl_team`
-- 

DROP TABLE IF EXISTS `tbl_team`;
CREATE TABLE IF NOT EXISTS `tbl_team` (
  `teamId` int(11) NOT NULL auto_increment,
  `teamName` varchar(30) NOT NULL,
  `rank` int(11) NOT NULL,
  `disable` int(11) NOT NULL,
  PRIMARY KEY  (`teamId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- 导出表中的数据 `tbl_team`
-- 

