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

 Date: 24/10/2020 17:07:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero`  (
  `id` int(0) NOT NULL COMMENT '编号',
  `name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '名称',
  `fee` int(0) NULL DEFAULT NULL COMMENT '费用',
  `profession` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '职业',
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `deleted` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT 'N' COMMENT '是否已删除Y：已删除，N：未删除',
  `created_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `updated_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `created_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `updated_by` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '人物表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES (1, '	卡牌大师	', 1, '	腥红之月	,	魔法师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (2, '	扭曲树精	', 1, '	永恒之森	,	斗士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (3, '	蜘蛛女皇	', 1, '	腥红之月	,	神盾使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (4, '	齐天大圣	', 1, '	天神	,	重装战士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (5, '	暗夜猎手	', 1, '	灵魂莲华夜幽	,	神射手			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (6, '	狂野女猎手	', 1, '	三国猛将	,	神射手			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (7, '	德玛西亚之力	', 1, '	三国猛将	,	重装战士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (8, '	无双剑姬	', 1, '	玉剑仙	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (9, '	冰霜女巫	', 1, '	月神	,	耀光使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (10, '	皎月女神	', 1, '	月神	,	刺客			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (11, '	疾风剑豪	', 1, '	浪人	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (12, '	河流之主	', 1, '	福星	,	斗士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (13, '	唤潮鲛姬	', 1, '	玉剑仙	,	魔法师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (14, '	黑暗之女	', 2, '	福星	,	魔法师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (15, '	迅捷斥候	', 2, '	灵魂莲华明昼	,	神射手			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (16, '	武器大师	', 2, '	天神	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (17, '	风暴之怒	', 2, '	玉剑仙	,	秘术师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (18, '	德玛西亚皇子	', 2, '	三国猛将	,	神盾使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (19, '	仙灵女巫	', 2, '	永恒之森	,	魔法师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (20, '	战争之影	', 2, '	永恒之森	,	重装战士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (21, '	影流之主	', 2, '	忍者	,	夜影			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (22, '	皮城执法官	', 2, '	三国猛将	,	斗士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (23, '	魂锁典狱长	', 2, '	灵魂莲华夜幽	,	重装战士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (24, '	解脱者	', 2, '	月神	,	斗士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (25, '	残月之肃	', 2, '	月神	,	猎人			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (26, '	血港鬼影	', 2, '	腥红之月	,	刺客			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (27, '	德邦总管	', 3, '	三国猛将	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (28, '	雪原双子	', 3, '	永恒之森	,	斗士			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (29, '	痛苦之拥	', 3, '	腥红之月	,	夜影			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (30, '	刀锋舞者	', 3, '	玉剑仙	,	天神	,	宗师	', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (31, '	邪恶小法师	', 3, '	永恒之森	,	魔法师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (32, '	不祥之刃	', 3, '	三国猛将	,	福星	,	刺客	', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (33, '	离群之刺	', 3, '	忍者	,	刺客			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (34, '	狂暴之心	', 3, '	忍者	,	神盾使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (35, '	光辉女郎	', 3, '	天神	,	耀光使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (36, '	永猎双子	', 3, '	灵魂莲华明昼	,	猎人			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (37, '	暴走萝莉	', 3, '	福星	,	神射手			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (38, '	魔法猫咪	', 3, '	灵魂莲华明昼	,	秘术师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (39, '	复仇之矛	', 3, '	腥红之月	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (40, '	祖安怒兽	', 4, '	天神	,	斗士	,	猎人	', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (41, '	寒冰射手	', 4, '	永恒之森	,	猎人			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (42, '	堕落天使	', 4, '	玉剑仙	,	耀光使			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (43, '	痛苦之拥	', 4, '	灵魂莲华夜幽	,	秘术师			', NULL, 'N', '2020-10-24 11:56:43', '2020-10-24 11:56:43', NULL, NULL);
INSERT INTO `hero` VALUES (44, '	刀锋之影	', 4, '	玉剑仙	,	刺客			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (45, '	放逐之刃	', 4, '	灵魂莲华夜幽	,	神盾使			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (46, '	暮光之眼	', 4, '	忍者	,	宗师	,	秘术师	', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (47, '	九尾妖狐	', 4, '	灵魂莲华明昼	,	魔法师			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (48, '	北地之怒	', 4, '	福星	,	重装战士			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (49, '	戏命师	', 4, '	腥红之月	,	神射手			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (50, '	暗裔剑魔	', 4, '	腥红之月	,	重装战士			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (51, '	时光守护者	', 5, '	腥红之月	,	秘术师			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (52, '	盲僧	', 5, '	天神	,	决斗大师			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (53, '	探险家	', 5, '	永恒之森	,	耀光使			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (54, '	影流之主	', 5, '	天煞	,	夜影			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (55, '	沙漠皇帝	', 5, '	三国猛将	,	神盾使	,	枭雄	', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (56, '	封魔剑魂	', 5, '	浪人	,	宗师			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (57, '	腕豪	', 5, '	霸王	,	斗士			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);
INSERT INTO `hero` VALUES (58, '	含羞蓓蕾	', 5, '	灵魂莲华夜幽	,	魔法师			', NULL, 'N', '2020-10-24 11:56:44', '2020-10-24 11:56:44', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
