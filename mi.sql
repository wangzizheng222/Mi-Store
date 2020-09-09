/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : mi

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 09/09/2020 19:45:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `version` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `num` int(0) NULL DEFAULT NULL,
  `item_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('wzz4', '6GB+128GB', '薄荷绿', 'Redmi K30 至尊版', 1, '2', '1999', '1');
INSERT INTO `cart` VALUES ('wzz4', '8GB+128GB', '太空灰', 'Redmi K30 Pro', 1, '7', '2699', '1');
INSERT INTO `cart` VALUES ('wzz2', '12GB+256GB', '云天黑', '腾讯黑鲨3S', 1, '3', '4299', '1');
INSERT INTO `cart` VALUES ('wzz3', '12GB+256GB', '水晶蓝', '腾讯黑鲨3S', 1, '3', '4299', '1');
INSERT INTO `cart` VALUES ('wzz4', '6GB+128GB', '薄荷绿', 'Redmi K30 至尊版', 1, '2', '1999', '1');
INSERT INTO `cart` VALUES ('wzz', '12GB+128GB', '云天黑', '腾讯黑鲨3S', 1, '3', '3999', '1');
INSERT INTO `cart` VALUES ('wzz', '8GB+256GB', '太空灰', 'Redmi K30 Pro', 1, '7', '3699', '1');
INSERT INTO `cart` VALUES ('wzz', '12GB+256GB', '冰海蓝', '小米10', 1, '6', '4399', '1');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `detail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `low_price` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `brief_intro` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `num` int(0) NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `version` varchar(2048) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `price` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `color` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', '小米10至尊纪念版', '「8月21日上午10点再次开售」120X 超远变焦 / 120W 秒充科技 / 120Hz刷新率 + 240Hz采样率 / 骁龙865旗舰处理器 / 双模5G / 10倍光学变焦 / OIS光学防抖+EIS数字防抖 / 2000万超清前置相机 / 双串蝶式石墨烯基锂离子电池 / 等效4500mAh大电量 / 120W 有线秒充+50W无线秒充+10W无线反充 / WiFi 6 / 多功能NFC / 红外遥控', '5299元起', '1', '120X 变焦/120W秒充/120Hz屏幕', 1, '1', '8GB+256GB,8GB+128GB,12GB+256GB,16GB+512GB', '5599,5299,5999,6999,5699,6999,5699', '陶瓷黑,透明版,亮银版');
INSERT INTO `item` VALUES ('2', 'Redmi K30 至尊版', '「8月25号上午10点开售，购机享6期分期免息，低至334元起/期；购机抽奖赢70英寸电视」120Hz弹出全面屏 / 天玑1000+旗舰处理器 / 索尼6400万四摄 / 立体声双扬声器 / 4500mAh+33W闪充 / 双模5G / 多功能NFC / 线性震动马达 / 红外遥控', '1999元起', '2', '120Hz弹出全面屏，天玑1000+旗舰处理器', 1, '1', '6GB+128GB,8GB+128GB,8GB+512Gb', '1999,2199,2499,1999,2199,2499', '薄荷绿,极夜黑,月慕白');
INSERT INTO `item` VALUES ('3', '腾讯黑鲨3S', '「购机享12期分期免息，赠价值179元冰封散热背夹Pro，前2000名评价晒单赠50元购物红包」骁龙865处理器 / 双模5G / 270Hz触控采样率+120Hz屏幕刷新率 / 三星AMOLED全面屏 / 最高65W极速闪充+背部磁吸充电 / 4720mAh大容量双电池 / UFS3.1闪存+LPDDR5运存 / “三明治”液冷散热 / JoyUI 12 游戏操作系统 / 畅玩投屏', '3999元起', '3', '骁龙865处理器，120Hz刷新率', 1, '1', '12GB+128GB,12GB+256GB', '3999,4299', '云天黑,水晶蓝');
INSERT INTO `item` VALUES ('4', 'Redmi 9A', '「4GB+64GB到手价仅599元」5000mAh长循环大电量 / 6.53\"超大护眼屏幕 / G25八核处理器 / 大音量扬声器 / 1300万 AI相机 / 人脸解锁 / 最高支持512GB存储扩展', '499元起', '4', '5000mAh长循环大电量，6.53\"超大护眼屏幕', 1, '1', '4GB+64GB,2GB+32GB', '599,499', '晴空蓝,砂石黑,湖光绿');
INSERT INTO `item` VALUES ('5', '小米10 青春版 5G', '「领券立减50元，享延保/碎屏保5折优惠，购机最高享6期免息」向往的生活同款/ 50倍潜望式超远变焦 / 双模5G / 骁龙765G处理器 / 三星AMOLED原色屏 / 180Hz采样率 / 4160mAh大电池 / 多功能NFC / 红外遥控器', '1899元起', '5', '50倍潜望式变焦 / 轻薄5G手机', 1, '1', '6GB+64GB,6GB+128GB,8GB+128GB,8GB+256GB', '1899,1999,2299,2599', '白桃乌龙,蓝莓薄荷,黑巧风暴,桃子西柚,四季春奶绿');
INSERT INTO `item` VALUES ('6', '小米10', '「小米10 8GB+128GB 冰海蓝闪降100元，到手价3699元」骁龙865处理器 / 1亿像素8K电影相机 / 双模5G / 新一代LPDDR5内存 / 对称式立体声 / 90Hz刷新率+180Hz采样率 / UFS 3.0高速存储 / 全面适配Wi-Fi 6 / 超强VC液冷散热 / 30W极速闪充+30W无线闪充+10W无线反充 / 4780mAh大电量 / 多功能NFC', '3699元起', '6', '骁龙865/1亿像素相机', 1, '1', '8GB+128GB,8GB+256GB,12GB+256GB', '3799,3999,4399', '国风雅灰,钛银黑,冰海蓝,蜜桃金');
INSERT INTO `item` VALUES ('7', 'Redmi K30 Pro', '「8GB+128GB到手价2699元起；购机享信用卡24期分期免息，低至113元起/期；延保、碎屏保5折」双模5G / 高通骁龙865 / 弹出式超光感全面屏 /索尼 6400万高清四摄 / 8K视频拍摄 / 超大面积VC立体散热 / 4700mAh+33W疾速闪充 / 多功能NFC / 红外遥控', '2699元起', '7', '双模5G，骁龙865，弹出全面屏', 1, '1', '8GB+128GB,12GB+128GB,8GB+256GB', '2699,2999,3699', '太空灰,天际蓝');
INSERT INTO `item` VALUES ('8', 'Redmi K30 Pro 变焦版', '双模5G / 高通骁龙865 / 弹出式超光感全面屏 / 索尼6400万双光学防抖四摄 / 8K视频拍摄 / 30倍变焦 / 超大面积VC立体散热 / 4700mAh+33W疾速闪充 / 多功能NFC / 红外遥控', '3799元', '8', '双模5G，骁龙865，弹出全面屏', 1, '1', '8GB+128GB', '3799', '月慕白,星环紫,天际蓝,太空灰');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `mi_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tel` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `mail` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '110', '2804355025@qq.com', '123', 'wzz');
INSERT INTO `user` VALUES ('2', '2', '123', '123', '123', 'wzz2');
INSERT INTO `user` VALUES ('3', '3', '1', '1', '1', 'wzz3');
INSERT INTO `user` VALUES ('4', '4', '1', '1', '11', 'wzz4');

SET FOREIGN_KEY_CHECKS = 1;
