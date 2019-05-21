CREATE DATABASE demo;

use demo;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '姓名',
  `adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `createtime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  `updatetime` datetime(0) DEFAULT NULL COMMENT '修改时间',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录密码',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1007 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1001, '张三', '山东济南', '2019-05-01 00:00:00', NULL, 'zhangsan', '123');
INSERT INTO `student` VALUES (1002, '李四', '山东济南', '2019-05-01 00:00:00', NULL, 'lisi', '123');
INSERT INTO `student` VALUES (1003, '王五', '山东青岛', '2019-05-01 00:00:00', NULL, 'wangwu', '123');
INSERT INTO `student` VALUES (1004, '马六', '山东潍坊', '2019-05-01 00:00:00', NULL, 'maliu', '123');
INSERT INTO `student` VALUES (1005, '赵七', '山东临沂', '2019-05-01 00:00:00', NULL, 'zhaoqi', '123');
INSERT INTO `student` VALUES (1006, '测试员', '四川成都', '2019-05-01 00:00:00', '2019-05-21 14:11:37', 'admin', '123');

SET FOREIGN_KEY_CHECKS = 1;
