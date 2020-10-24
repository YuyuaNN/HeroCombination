/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : hero

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 24/10/2020 17:08:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for feature
-- ----------------------------
DROP TABLE IF EXISTS `feature`;
CREATE TABLE `feature`  (
  `id` int(0) NOT NULL COMMENT '编号',
  `feature_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `combination` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '组合数量',
  `combination_fee` int(0) NULL DEFAULT NULL COMMENT '组合费用',
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'N' COMMENT '是否已删除Y：已删除，N：未删除',
  `created_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updated_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `created_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `updated_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '特征表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of feature
-- ----------------------------
INSERT INTO `feature` VALUES (1, '	腥红之月	', '	3	,	6	,	9			', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (2, '	天神	', '	2	,	4	,	6	,	8	', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (3, '	灵魂莲华夜幽	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (4, '	永恒之森	', '	3	,	6	,	9			', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (5, '	玉剑仙	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (6, '	浪人	', '	1	,	2					', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (7, '	福星	', '	3	,	6					', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (8, '	月神	', '	3	,	5					', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (9, '	忍者	', '	1	,	4					', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (10, '	灵魂莲华明昼	', '	2	,	4					', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (11, '	霸王	', '	1							', NULL, NULL, 'N', '2020-10-24 12:14:45', '2020-10-24 12:14:45', NULL, NULL);
INSERT INTO `feature` VALUES (12, '	三国猛将	', '	3	,	6	,	9			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (13, '	天煞	', '	1							', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (14, '	宗师	', '	2	,	3	,	4			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (15, '	刺客	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (16, '	斗士	', '	2	,	4	,	6	,	8	', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (17, '	耀光使	', '	2	,	4					', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (18, '	决斗大师	', '	2	,	4	,	6	,	8	', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (19, '	猎人	', '	2	,	3	,	4	,	5	', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (20, '	神盾使	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (21, '	魔法师	', '	3	,	6	,	9			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (22, '	秘术师	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (23, '	夜影	', '	2	,	3	,	4			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (24, '	神射手	', '	2	,	4	,	6			', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (25, '	重装战士	', '	2	,	4	,	6	,	8	', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);
INSERT INTO `feature` VALUES (26, '	枭雄	', '	1							', NULL, NULL, 'N', '2020-10-24 12:14:46', '2020-10-24 12:14:46', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
