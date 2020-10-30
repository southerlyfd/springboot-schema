DROP DATABASE IF EXISTS springbootBxMp5;

CREATE DATABASE springbootBxMp5 default character set utf8mb4 collate utf8mb4_general_ci;

USE springbootBxMp5;

DROP TABLE IF EXISTS `shujifenlei`;

CREATE TABLE `shujifenlei` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`shujileibie` varchar(200)    COMMENT '书籍类别',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='书籍分类';

DROP TABLE IF EXISTS `yingyinfenlei`;

CREATE TABLE `yingyinfenlei` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`yingyinleibie` varchar(200)    COMMENT '影音类别',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='影音分类';

DROP TABLE IF EXISTS `ershoushuji`;

CREATE TABLE `ershoushuji` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`maijiahao` varchar(200)    COMMENT '卖家号',
	`xingming` varchar(200)    COMMENT '姓名',
	`shujimingcheng` varchar(200)    COMMENT '书籍名称',
	`shujileibie` varchar(200)    COMMENT '书籍类别',
	`zuozhe` varchar(200)    COMMENT '作者',
	`shujifengmian` varchar(200)    COMMENT '书籍封面',
	`quanxinjiage` varchar(200)    COMMENT '全新价格',
	`ershoujiage` varchar(200)    COMMENT '二手价格',
	`xinjiuchengdu` varchar(200)    COMMENT '新旧程度',
	`jianjie` longtext    COMMENT '简介',
	`thumbsupnum` int   default '0' COMMENT '赞',
	`crazilynum` int   default '0' COMMENT '踩',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手书籍';

DROP TABLE IF EXISTS `ershouyingyin`;

CREATE TABLE `ershouyingyin` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`maijiahao` varchar(200)    COMMENT '卖家号',
	`xingming` varchar(200)    COMMENT '姓名',
	`yingyinmingcheng` varchar(200)    COMMENT '影音名称',
	`yingyinleibie` varchar(200)    COMMENT '影音类别',
	`fengmian` varchar(200)    COMMENT '封面',
	`quanxinjiage` varchar(200)    COMMENT '全新价格',
	`ershoujiage` varchar(200)    COMMENT '二手价格',
	`xinjiuchengdu` varchar(200)    COMMENT '新旧程度',
	`yingyinjieshao` longtext    COMMENT '影音介绍',
	`thumbsupnum` int   default '0' COMMENT '赞',
	`crazilynum` int   default '0' COMMENT '踩',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手影音';

DROP TABLE IF EXISTS `maijia`;

CREATE TABLE `maijia` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`maijiahao` varchar(200)  UNIQUE   COMMENT '卖家号',
	`mima` varchar(200)    COMMENT '密码',
	`xingming` varchar(200)    COMMENT '姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`touxiang` varchar(200)    COMMENT '头像',
	`shouji` varchar(200)    COMMENT '手机',
	`shenfenzheng` varchar(200)    COMMENT '身份证',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卖家';

DROP TABLE IF EXISTS `ershoushujidingdan`;

CREATE TABLE `ershoushujidingdan` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`maijiahao` varchar(200)    COMMENT '卖家号',
	`xingming` varchar(200)    COMMENT '姓名',
	`shujimingcheng` varchar(200)    COMMENT '书籍名称',
	`shujileibie` varchar(200)    COMMENT '书籍类别',
	`ershoujiage` varchar(200)    COMMENT '二手价格',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`shouhuodizhi` varchar(200)    COMMENT '收货地址',
	`shouhuoren` varchar(200)    COMMENT '收货人',
	`lianxidianhua` varchar(200)    COMMENT '联系电话',
	`dingdanbeizhu` varchar(200)    COMMENT '订单备注',
	`ispay` varchar(200)   default '未支付' COMMENT '是否支付',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手书籍订单';

DROP TABLE IF EXISTS `ershouyingyindingdan`;

CREATE TABLE `ershouyingyindingdan` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`maijiahao` varchar(200)    COMMENT '卖家号',
	`xingming` varchar(200)    COMMENT '姓名',
	`yingyinmingcheng` varchar(200)    COMMENT '影音名称',
	`yingyinleibie` varchar(200)    COMMENT '影音类别',
	`ershoujiage` varchar(200)    COMMENT '二手价格',
	`yonghuming` varchar(200)    COMMENT '用户名',
	`shouhuodizhi` varchar(200)    COMMENT '收货地址',
	`shouhuoren` varchar(200)    COMMENT '收货人',
	`lianxidianhua` varchar(200)    COMMENT '联系电话',
	`dingdanbeizhu` varchar(200)    COMMENT '订单备注',
	`ispay` varchar(200)   default '未支付' COMMENT '是否支付',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手影音订单';

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`yonghuming` varchar(200)  UNIQUE   COMMENT '用户名',
	`mima` varchar(200)    COMMENT '密码',
	`xingming` varchar(200)    COMMENT '姓名',
	`xingbie` varchar(200)    COMMENT '性别',
	`touxiang` varchar(200)    COMMENT '头像',
	`shouji` varchar(200)    COMMENT '手机',
	`weixin` varchar(200)    COMMENT '微信',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

DROP TABLE IF EXISTS `storeup`;

CREATE TABLE `storeup` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`userid` bigint NOT NULL   COMMENT '用户id',
	`refid` int    COMMENT '收藏id',
	`tablename` varchar(200)    COMMENT '表名',
	`name` varchar(200) NOT NULL   COMMENT '收藏名称',
	`picture` varchar(200) NOT NULL   COMMENT '收藏图片',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`content` longtext NOT NULL   COMMENT '内容',
	`userid` varchar(200) NOT NULL   COMMENT '留言人id',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言板';

DROP TABLE IF EXISTS `discussershoushuji`;

CREATE TABLE `discussershoushuji` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`refid` bigint NOT NULL   COMMENT '关联表id',
	`content` varchar(200) NOT NULL   COMMENT '评论内容',
	`userid` bigint NOT NULL   COMMENT '用户id',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手书籍评论表';

DROP TABLE IF EXISTS `discussershouyingyin`;

CREATE TABLE `discussershouyingyin` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP,
	`refid` bigint NOT NULL   COMMENT '关联表id',
	`content` varchar(200) NOT NULL   COMMENT '评论内容',
	`userid` bigint NOT NULL   COMMENT '用户id',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='二手影音评论表';


DROP TABLE IF EXISTS `config`;

CREATE TABLE `config`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`name` varchar(100) NOT NULL COMMENT '配置参数名称',
	`value` varchar(100) COMMENT '配置参数值',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置文件';

insert into config(id,name) values(1,'picture1');
insert into config(id,name) values(2,'picture2');
insert into config(id,name) values(3,'picture3');
insert into config(id,name) values(4,'picture4');
insert into config(id,name) values(5,'picture5');
insert into config(id,name) values(6,'homepage');


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`password` varchar(100) NOT NULL COMMENT '密码',
	`role` varchar(100) default '管理员' COMMENT '角色',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into users(id,username, password) values(1,'abo','abo');

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token`(
	`id` bigint NOT NULL AUTO_INCREMENT,
	`userid` bigint NOT NULL COMMENT '用户id',
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`tablename` varchar(100) COMMENT '表名',
	`role` varchar(100) COMMENT '角色',
	`token` varchar(200) NOT NULL COMMENT '密码',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	`expiratedtime` timestamp COMMENT '过期时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';

