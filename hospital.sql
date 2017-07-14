/*
Navicat MySQL Data Transfer

Source Server         : .
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : hospital

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-04-23 14:18:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for appointment
-- ----------------------------
DROP TABLE IF EXISTS `appointment`;
CREATE TABLE `appointment` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `patientname` varchar(20) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `visittime` varchar(100) DEFAULT NULL,
  `visitseq` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appointment
-- ----------------------------
INSERT INTO `appointment` VALUES ('1', '2', '2', '4', '2016-04-20  星期三下午', '1');
INSERT INTO `appointment` VALUES ('2', '3', '3', '4', '2016-04-20  星期三下午', '2');
INSERT INTO `appointment` VALUES ('3', '1', '1', '4', '2016-04-20  星期三下午', '3');
INSERT INTO `appointment` VALUES ('4', '8', '8', '4', '2016-04-20  星期三下午', '4');
INSERT INTO `appointment` VALUES ('5', '4', '4', '4', '2016-04-20  星期三下午', '5');
INSERT INTO `appointment` VALUES ('6', '5', '5', '4', '2016-04-20  星期三下午', '6');
INSERT INTO `appointment` VALUES ('7', '6', '6', '4', '2016-04-20  星期三下午', '7');
INSERT INTO `appointment` VALUES ('8', '7', '7', '4', '2016-04-20  星期三下午', '8');
INSERT INTO `appointment` VALUES ('9', '12', '12', '4', '2016-04-20  星期三下午', '9');
INSERT INTO `appointment` VALUES ('10', '13', '13', '4', '2016-04-20  星期三下午', '10');
INSERT INTO `appointment` VALUES ('16', '18', '18', '2', '2016-04-25  星期一下午', '1');
INSERT INTO `appointment` VALUES ('17', '1', '1', '2', '2016-04-25  星期一下午', '2');
INSERT INTO `appointment` VALUES ('18', '2', '2', '2', '2016-04-25  星期一下午', '3');
INSERT INTO `appointment` VALUES ('19', '3', '3', '2', '2016-04-25  星期一下午', '4');
INSERT INTO `appointment` VALUES ('20', '4', '4', '2', '2016-04-25  星期一下午', '5');
INSERT INTO `appointment` VALUES ('21', '8', '8', '2', '2016-04-25  星期一下午', '6');
INSERT INTO `appointment` VALUES ('22', '7', '20', '2', '2016-04-25  星期一下午', '7');
INSERT INTO `appointment` VALUES ('23', '6', '6', '2', '2016-04-25  星期一下午', '8');
INSERT INTO `appointment` VALUES ('24', '5', '5', '2', '2016-04-25  星期一下午', '9');
INSERT INTO `appointment` VALUES ('25', '9', '9', '2', '2016-04-25  星期一下午', '10');
INSERT INTO `appointment` VALUES ('26', '10', '10', '2', '2016-04-25  星期一下午', '11');
INSERT INTO `appointment` VALUES ('27', '13', '13', '2', '2016-04-25  星期一下午', '12');
INSERT INTO `appointment` VALUES ('28', '12', '12', '2', '2016-04-25  星期一下午', '13');
INSERT INTO `appointment` VALUES ('29', '11', '11', '2', '2016-04-25  星期一下午', '14');
INSERT INTO `appointment` VALUES ('30', '14', '14', '2', '2016-04-25  星期一下午', '15');
INSERT INTO `appointment` VALUES ('31', '15', '15', '2', '2016-04-25  星期一下午', '16');
INSERT INTO `appointment` VALUES ('32', '16', '16', '2', '2016-04-25  星期一下午', '17');
INSERT INTO `appointment` VALUES ('33', '17', '17', '2', '2016-04-25  星期一下午', '18');
INSERT INTO `appointment` VALUES ('34', '5', '5', '4', '2016-04-22  星期五上午', '1');
INSERT INTO `appointment` VALUES ('35', '1', '1', '4', '2016-04-22  星期五上午', '2');
INSERT INTO `appointment` VALUES ('36', '2', '2', '4', '2016-04-22  星期五上午', '3');
INSERT INTO `appointment` VALUES ('37', '4', '4', '4', '2016-04-22  星期五上午', '4');
INSERT INTO `appointment` VALUES ('38', '3', '3', '4', '2016-04-22  星期五上午', '5');
INSERT INTO `appointment` VALUES ('39', '6', '6', '4', '2016-04-22  星期五上午', '6');
INSERT INTO `appointment` VALUES ('40', '7', '7', '4', '2016-04-22  星期五上午', '7');
INSERT INTO `appointment` VALUES ('41', '11', '11', '4', '2016-04-22  星期五上午', '8');
INSERT INTO `appointment` VALUES ('42', '17', '12', '4', '2016-04-22  星期五上午', '9');
INSERT INTO `appointment` VALUES ('43', '8', '8', '4', '2016-04-22  星期五上午', '10');
INSERT INTO `appointment` VALUES ('44', '9', '9', '4', '2016-04-22  星期五上午', '11');
INSERT INTO `appointment` VALUES ('45', '10', '10', '4', '2016-04-22  星期五上午', '12');
INSERT INTO `appointment` VALUES ('47', '13', '13', '4', '2016-04-22  星期五上午', '14');
INSERT INTO `appointment` VALUES ('54', '9', '9', '4', '2016-04-20  星期三下午', '11');
INSERT INTO `appointment` VALUES ('55', '10', '21', '4', '2016-04-20  星期三下午', '12');
INSERT INTO `appointment` VALUES ('56', '22', '22', '4', '2016-04-20  星期三下午', '13');
INSERT INTO `appointment` VALUES ('57', '23', '23', '4', '2016-04-20  星期三下午', '14');
INSERT INTO `appointment` VALUES ('59', '24', '24', '4', '2016-04-20  星期三下午', '15');
INSERT INTO `appointment` VALUES ('60', '1', '1', '1', '2017-04-20  星期四上午', '19');
INSERT INTO `appointment` VALUES ('61', '1', '1', '1', '2017-04-27  星期四上午', '19');
INSERT INTO `appointment` VALUES ('62', '1', '1', '1', '2017-04-27  星期四上午', '19');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) NOT NULL,
  `dspec` varchar(500) DEFAULT NULL,
  `pdid` int(11) DEFAULT NULL,
  PRIMARY KEY (`did`),
  UNIQUE KEY `d_name` (`dname`),
  KEY `p_did` (`pdid`),
  CONSTRAINT `dept_ibfk_1` FOREIGN KEY (`pdid`) REFERENCES `dept` (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '内科', null, null);
INSERT INTO `dept` VALUES ('2', '外科', null, null);
INSERT INTO `dept` VALUES ('3', '儿科', null, null);
INSERT INTO `dept` VALUES ('4', '口腔科', null, null);
INSERT INTO `dept` VALUES ('5', '眼科', null, null);
INSERT INTO `dept` VALUES ('6', '骨科', null, null);
INSERT INTO `dept` VALUES ('7', '妇产科', null, null);
INSERT INTO `dept` VALUES ('8', '心血管内科', null, '1');
INSERT INTO `dept` VALUES ('9', '神经内科', '主要诊治脑血管疾病（脑梗塞、脑出血）、偏头痛、脑部炎症性疾病（脑炎、脑膜炎）、脊髓炎、癫痫、痴呆、神经系统变性病、代谢病和遗传病、三叉神经痛、坐骨神经病、周围神经病（四肢麻木、无力）及重症肌无力等', '1');
INSERT INTO `dept` VALUES ('10', '内分泌科', null, '1');
INSERT INTO `dept` VALUES ('11', '呼吸内科', null, '1');
INSERT INTO `dept` VALUES ('12', '消化内科', null, '1');
INSERT INTO `dept` VALUES ('13', '肾脏内科', '肾内科是各级医院为了诊疗肾脏病而设置的一个临床科室。常见的肾脏替代治疗方式有肾移植、血液透析和腹膜透析', '1');
INSERT INTO `dept` VALUES ('14', '风湿免疫科', null, '1');
INSERT INTO `dept` VALUES ('15', '血液科', null, '1');
INSERT INTO `dept` VALUES ('16', '感染科', null, '1');
INSERT INTO `dept` VALUES ('17', '肝病科', null, '1');
INSERT INTO `dept` VALUES ('18', '泌尿外科', null, '2');
INSERT INTO `dept` VALUES ('19', '神经外科', null, '2');
INSERT INTO `dept` VALUES ('20', '心脏外科', null, '2');
INSERT INTO `dept` VALUES ('21', '胸外科', null, '2');
INSERT INTO `dept` VALUES ('22', '胃外科', null, '2');
INSERT INTO `dept` VALUES ('23', '肠外科', null, '2');
INSERT INTO `dept` VALUES ('24', '肝外科', null, '2');
INSERT INTO `dept` VALUES ('25', '胆外科', null, '2');
INSERT INTO `dept` VALUES ('26', '血管外科', null, '2');
INSERT INTO `dept` VALUES ('27', '外伤科', null, '2');
INSERT INTO `dept` VALUES ('28', '烧伤科', null, '2');
INSERT INTO `dept` VALUES ('29', '小儿消化科', null, '3');
INSERT INTO `dept` VALUES ('30', '小儿呼吸科', '儿童哮喘、婴儿喘息、反复呼吸道感染、慢性咳嗽、肺炎等疑难杂症', '3');
INSERT INTO `dept` VALUES ('31', '小儿皮肤科', '主要治疗幼儿、儿童的各种皮肤病，常见皮肤病有牛皮癣 、 疱疹 、酒渣鼻 、脓疱疮等', '3');
INSERT INTO `dept` VALUES ('32', '儿童保健科', null, '3');
INSERT INTO `dept` VALUES ('33', '新生儿科', null, '3');
INSERT INTO `dept` VALUES ('34', '小儿骨科', null, '3');
INSERT INTO `dept` VALUES ('35', '小儿心血管内科', null, '3');
INSERT INTO `dept` VALUES ('36', '小儿免疫科', null, '3');
INSERT INTO `dept` VALUES ('37', '小儿肾内科', null, '3');
INSERT INTO `dept` VALUES ('38', '小儿血液科', null, '3');
INSERT INTO `dept` VALUES ('39', '小儿内分泌科', null, '3');
INSERT INTO `dept` VALUES ('40', '小儿外科', null, '3');
INSERT INTO `dept` VALUES ('41', '小儿心外科', null, '3');
INSERT INTO `dept` VALUES ('42', '小儿胸外科', null, '3');
INSERT INTO `dept` VALUES ('43', '小儿神经外科', null, '3');
INSERT INTO `dept` VALUES ('44', '小儿泌尿科', null, '3');
INSERT INTO `dept` VALUES ('45', '小儿遗传病科', null, '3');
INSERT INTO `dept` VALUES ('46', '小儿耳鼻喉科', null, '3');
INSERT INTO `dept` VALUES ('47', '口腔修复科', null, '4');
INSERT INTO `dept` VALUES ('48', '正畸科', null, '4');
INSERT INTO `dept` VALUES ('49', '牙体牙髓科', null, '4');
INSERT INTO `dept` VALUES ('50', '牙周科', null, '4');
INSERT INTO `dept` VALUES ('51', '种植科', null, '4');
INSERT INTO `dept` VALUES ('52', '口腔粘膜科', '口腔粘膜科是治疗粘膜病的专业科室，主要从事口腔粘膜病的治疗', '4');
INSERT INTO `dept` VALUES ('53', '口腔预防科', null, '4');
INSERT INTO `dept` VALUES ('54', '儿童口腔科', null, '4');
INSERT INTO `dept` VALUES ('55', '眼视光学科', null, '5');
INSERT INTO `dept` VALUES ('56', '眼外伤科', null, '5');
INSERT INTO `dept` VALUES ('57', '眼底科', null, '5');
INSERT INTO `dept` VALUES ('58', '白内障科', null, '5');
INSERT INTO `dept` VALUES ('59', '角膜科', null, '5');
INSERT INTO `dept` VALUES ('60', '青光眼科', null, '5');
INSERT INTO `dept` VALUES ('61', '眼整形科', null, '5');
INSERT INTO `dept` VALUES ('62', '小儿眼科', null, '5');
INSERT INTO `dept` VALUES ('63', '骨关节科', null, '6');
INSERT INTO `dept` VALUES ('64', '脊柱外科', '专门诊治脊柱骨折、创伤、颈椎病、腰椎间盘突出症、脊柱肿瘤、颈、腰人工椎间盘置换、脊柱翻修等', '6');
INSERT INTO `dept` VALUES ('65', '足踝外科', null, '6');
INSERT INTO `dept` VALUES ('66', '创伤外科', null, '6');
INSERT INTO `dept` VALUES ('67', '运动医学科', null, '6');
INSERT INTO `dept` VALUES ('68', '矫形骨科', null, '6');
INSERT INTO `dept` VALUES ('69', '妇科', null, '7');
INSERT INTO `dept` VALUES ('70', '产科', null, '7');
INSERT INTO `dept` VALUES ('71', '产前诊断科', null, '7');
INSERT INTO `dept` VALUES ('72', '计划生育科', null, '7');
INSERT INTO `dept` VALUES ('73', '妇泌尿科', null, '7');
INSERT INTO `dept` VALUES ('74', '妇科内分泌', null, '7');
INSERT INTO `dept` VALUES ('75', '遗传科', null, '7');
INSERT INTO `dept` VALUES ('76', '过敏反应科', null, '1');
INSERT INTO `dept` VALUES ('77', '老年病科', null, '1');
INSERT INTO `dept` VALUES ('78', '肿瘤科', null, null);
INSERT INTO `dept` VALUES ('79', '肿瘤内科', null, '78');

-- ----------------------------
-- Table structure for hospital
-- ----------------------------
DROP TABLE IF EXISTS `hospital`;
CREATE TABLE `hospital` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `hname` varchar(50) NOT NULL,
  `address` varchar(50) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`hid`),
  UNIQUE KEY `h_name` (`hname`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hospital
-- ----------------------------
INSERT INTO `hospital` VALUES ('1', '武汉同济医院', '武汉市解放大道1095号', '三甲');
INSERT INTO `hospital` VALUES ('2', '武汉协和医院', '武汉市解放大道1277', '三甲');
INSERT INTO `hospital` VALUES ('3', '湖北省人民医院', '武汉市张之洞路95', '三甲');
INSERT INTO `hospital` VALUES ('4', '武汉市第一医院', '武汉市中山大道215号', '三甲');
INSERT INTO `hospital` VALUES ('5', '武汉市第四医院', '武汉市汉正街472号', '三甲');
INSERT INTO `hospital` VALUES ('6', '武汉市第六医院', '武汉市香港路80号', '三乙');
INSERT INTO `hospital` VALUES ('7', '武汉市第九医院', '武汉市吉林街20号', '二级');
INSERT INTO `hospital` VALUES ('8', '武汉市商业职工医院', '武汉市大兴路13号', '二级');

-- ----------------------------
-- Table structure for mediciner
-- ----------------------------
DROP TABLE IF EXISTS `mediciner`;
CREATE TABLE `mediciner` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `mname` varchar(20) NOT NULL,
  `title` varchar(20) DEFAULT NULL,
  `mspec` varchar(500) DEFAULT NULL,
  `surgeryweekday` varchar(100) DEFAULT NULL,
  `limitvisits` varchar(20) DEFAULT NULL,
  `hospital` varchar(20) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mid`),
  KEY `hospital` (`hospital`),
  KEY `dept` (`dept`),
  CONSTRAINT `mediciner_ibfk_1` FOREIGN KEY (`hospital`) REFERENCES `hospital` (`hname`),
  CONSTRAINT `mediciner_ibfk_2` FOREIGN KEY (`dept`) REFERENCES `dept` (`dname`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mediciner
-- ----------------------------
INSERT INTO `mediciner` VALUES ('1', '蔡红国', '主任医师', null, '星期二上午,星期二下午,星期四上午', '18', '武汉协和医院', '小儿呼吸科');
INSERT INTO `mediciner` VALUES ('2', '陈乾坤', '副主任医师', null, '星期一下午,星期三上午,星期三下午', '18', '武汉市第一医院', '消化内科');
INSERT INTO `mediciner` VALUES ('3', '陈诗云', '主任医师', null, '星期三上午,星期四上午', '15', '湖北省人民医院', '小儿皮肤科');
INSERT INTO `mediciner` VALUES ('4', '曹磊军', '主任医师', null, '星期三上午,星期三下午,星期五上午', '15', '武汉同济医院', '口腔粘膜科');
INSERT INTO `mediciner` VALUES ('5', '崔敬娴', '副主任医师', null, '星期三下午,星期四上午', '18', '武汉市第四医院', '骨关节科');
INSERT INTO `mediciner` VALUES ('6', '邓红娟', '主任医师', null, '星期一上午,星期三上午,星期五下午', '16', '武汉同济医院', '脊柱外科');
INSERT INTO `mediciner` VALUES ('7', '邓金余', '副主任医师', null, '星期三上午,星期三下午,星期五上午', '18', '湖北省人民医院', '泌尿外科');
INSERT INTO `mediciner` VALUES ('8', '方新章', '主任医师', null, '星期二下午,星期四上午', '15', '武汉协和医院', '肾脏内科');
INSERT INTO `mediciner` VALUES ('9', '董琴怡', '主任医师', null, '星期三下午,星期四上午,星期四下午', '18', '武汉同济医院', '小儿皮肤科');
INSERT INTO `mediciner` VALUES ('11', '张兆辉', '付主任医师', null, '星期一上午,星期二上午', '15', '武汉同济医院', '神经内科');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL,
  `uname` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `identity` varchar(50) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhang1m', '123', '张一男', '男', '42010419780210****', '15927092***');
INSERT INTO `user` VALUES ('2', 'zhang2m', '123', '张二男', '男', '42020119690112****', '1381212****');
INSERT INTO `user` VALUES ('3', 'zhang3m', '123', '张三男', '男', '42010419821012****', '1369898****');
INSERT INTO `user` VALUES ('4', 'zhang4m', '123', '张四男', '男', null, null);
INSERT INTO `user` VALUES ('5', 'zhang5m', '123', '张五男', '男', null, null);
INSERT INTO `user` VALUES ('6', 'zhang6m', '123', '张六男', '男', null, null);
INSERT INTO `user` VALUES ('7', 'zhang7m', '123', '张七男', '男', null, null);
INSERT INTO `user` VALUES ('8', 'zhang8m', '123', '张八男', '男', null, null);
INSERT INTO `user` VALUES ('9', 'zhang9m', '123', '张九男', '男', null, null);
INSERT INTO `user` VALUES ('10', 'zhang0m', '123', '张零男', '男', null, null);
INSERT INTO `user` VALUES ('11', 'zhang0f', '123', '张零女', '女', null, null);
INSERT INTO `user` VALUES ('12', 'zhang1f', '123', '张一女', '女', null, null);
INSERT INTO `user` VALUES ('13', 'zhang2f', '123', '张二女', '女', null, null);
INSERT INTO `user` VALUES ('14', 'zhang3f', '123', '张三女', '女', null, null);
INSERT INTO `user` VALUES ('15', 'zhang4f', '123', '张四女', '女', null, null);
INSERT INTO `user` VALUES ('16', 'zhang5f', '123', '张五女', '女', null, null);
INSERT INTO `user` VALUES ('17', 'zhang6f', '123', '张六女', '女', null, null);
INSERT INTO `user` VALUES ('18', 'zhang7f', '123', '张七女', '女', null, null);
INSERT INTO `user` VALUES ('19', 'zhang8f', '123', '张八女', '女', null, null);
INSERT INTO `user` VALUES ('20', 'zhang9f', '123', '张九女', '女', null, null);
INSERT INTO `user` VALUES ('21', 'li0f', '123', '李零女', '女', null, null);
INSERT INTO `user` VALUES ('22', 'li1f', '123', '李一女', '女', null, null);
INSERT INTO `user` VALUES ('23', 'li2f', '123', '李二女', '女', null, null);
INSERT INTO `user` VALUES ('24', 'li3f', '123', '李三女', '女', null, null);
INSERT INTO `user` VALUES ('25', 'li4f', '123', '李四女', '女', null, null);
INSERT INTO `user` VALUES ('26', 'li5f', '123', '李五女', '女', null, null);
INSERT INTO `user` VALUES ('27', 'li6f', '123', '李六女', '女', null, null);
INSERT INTO `user` VALUES ('28', 'li7f', '123', '李七女', '女', null, null);
INSERT INTO `user` VALUES ('29', 'li8f', '123', '李八女', '女', null, null);
INSERT INTO `user` VALUES ('30', 'li9f', '123', '李九女', '女', null, null);
INSERT INTO `user` VALUES ('31', 'li0m', '123', '李零男', '男', null, null);
INSERT INTO `user` VALUES ('32', 'li1m', '123', '李一男', '男', null, null);
INSERT INTO `user` VALUES ('33', 'li2m', '123', '李二男', '男', null, null);
INSERT INTO `user` VALUES ('34', 'li3m', '123', '李三男', '男', null, null);
INSERT INTO `user` VALUES ('35', 'li4m', '123', '李四男', '男', null, null);
INSERT INTO `user` VALUES ('36', 'li5m', '123', '李五男', '男', null, null);
INSERT INTO `user` VALUES ('37', 'li6m', '123', '李六男', '男', null, null);
INSERT INTO `user` VALUES ('38', 'li7m', '123', '李七男', '男', null, null);
INSERT INTO `user` VALUES ('39', 'li8m', '123', '李八男', '男', null, null);
INSERT INTO `user` VALUES ('40', 'li9m', '123', '李九男', '男', null, null);
INSERT INTO `user` VALUES ('41', 'wang0m', '123', '王零男', '男', null, null);
INSERT INTO `user` VALUES ('42', 'wang1m', '123', '王一男', '男', null, null);
INSERT INTO `user` VALUES ('43', 'wang2m', '123', '王二男', '男', null, null);
INSERT INTO `user` VALUES ('44', 'wang3m', '123', '王三男', '男', null, null);
INSERT INTO `user` VALUES ('45', 'wang4m', '123', '王四男', '男', null, null);
INSERT INTO `user` VALUES ('46', 'wang5m', '123', '王五男', '男', null, null);
INSERT INTO `user` VALUES ('47', 'wang6m', '123', '王六男', '男', null, null);
INSERT INTO `user` VALUES ('48', 'wang7m', '123', '王七男', '男', null, null);
INSERT INTO `user` VALUES ('49', 'wang8m', '123', '王八男', '男', null, null);
INSERT INTO `user` VALUES ('50', 'wang9m', '123', '王九男', '男', null, null);
INSERT INTO `user` VALUES ('51', 'wang0f', '123', '王零女', '女', null, null);
INSERT INTO `user` VALUES ('52', 'wang1f', '123', '王一女', '女', null, null);
INSERT INTO `user` VALUES ('53', 'wang2f', '123', '王二女', '女', null, null);
INSERT INTO `user` VALUES ('54', 'wang3f', '123', '王三女', '女', null, null);
INSERT INTO `user` VALUES ('55', 'wang4f', '123', '王四女', '女', null, null);
INSERT INTO `user` VALUES ('56', 'wang5f', '123', '王五女', '女', null, null);
INSERT INTO `user` VALUES ('57', 'wang6f', '123', '王六女', '女', null, null);
INSERT INTO `user` VALUES ('58', 'wang7f', '123', '王七女', '女', null, null);
INSERT INTO `user` VALUES ('59', 'wang8f', '123', '王八女', '女', null, null);
INSERT INTO `user` VALUES ('60', 'wang9f', '123', '王九女', '女', null, null);
INSERT INTO `user` VALUES ('61', 'zhao1m', '123', '赵一男', '男', null, null);
INSERT INTO `user` VALUES ('62', 'zhangmeng1', '123', '我啊', '男', null, null);

-- ----------------------------
-- Procedure structure for pro_set
-- ----------------------------
DROP PROCEDURE IF EXISTS `pro_set`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `pro_set`(
	_uid int,
	_mid int,
	_visittime VARCHAR(100),
	out flag int
)
BEGIN
	DECLARE count int;
	DECLARE _limitvisits int;
	SELECT limitvisits INTO _limitvisits from mediciner where mid=_mid;
	SELECT count(*) INTO count from appointment where mid=4 and visittime='2016-04-20  星期三下午';
	IF(count+1>_limitvisits) THEN
		set flag = 0;
	ELSE
		INSERT appointment values(NULL,_uid,_uid,_mid,_visittime,_limitvisits+1);
		set flag = 1;
	END IF;
END
;;
DELIMITER ;
