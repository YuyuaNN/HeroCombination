package com.springboot.cloud.sysadmin.organization.config;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class InitHero {
    /**
     * 初始化 Hero 池
     *
     * @return
     */
    public static Hero[] initHero() {
        Set<Hero> set = new HashSet<Hero>();
        Hero hero = null;

        hero = new Hero("卡牌大师", 1, new String[]{"腥红之月", "魔法师"});
        set.add(hero);
        hero = new Hero("扭曲树精", 1, new String[]{"永恒之森", "斗士"});
        set.add(hero);
        hero = new Hero("蜘蛛女皇", 1, new String[]{"腥红之月", "神盾使"});
        set.add(hero);
        hero = new Hero("齐天大圣", 1, new String[]{"天神", "重装战士"});
        set.add(hero);
        hero = new Hero("暗夜猎手", 1, new String[]{"灵魂莲华夜幽", "神射手"});
        set.add(hero);
        hero = new Hero("狂野女猎手", 1, new String[]{"三国猛将", "神射手"});
        set.add(hero);
        hero = new Hero("德玛西亚之力", 1, new String[]{"三国猛将", "重装战士"});
        set.add(hero);
        hero = new Hero("无双剑姬", 1, new String[]{"玉剑仙", "决斗大师"});
        set.add(hero);
        hero = new Hero("冰霜女巫", 1, new String[]{"月神", "耀光使"});
        set.add(hero);
        hero = new Hero("皎月女神", 1, new String[]{"月神", "刺客"});
        set.add(hero);
        hero = new Hero("疾风剑豪", 1, new String[]{"浪人", "决斗大师"});
        set.add(hero);
        hero = new Hero("河流之主", 1, new String[]{"福星", "斗士"});
        set.add(hero);
        hero = new Hero("唤潮鲛姬", 1, new String[]{"玉剑仙", "魔法师"});
        set.add(hero);
        hero = new Hero("黑暗之女", 2, new String[]{"福星", "魔法师"});
        set.add(hero);
        hero = new Hero("迅捷斥候", 2, new String[]{"灵魂莲华明昼", "神射手"});
        set.add(hero);
        hero = new Hero("武器大师", 2, new String[]{"天神", "决斗大师"});
        set.add(hero);
        hero = new Hero("风暴之怒", 2, new String[]{"玉剑仙", "秘术师"});
        set.add(hero);
        hero = new Hero("德玛西亚皇子", 2, new String[]{"三国猛将", "神盾使"});
        set.add(hero);
        hero = new Hero("仙灵女巫", 2, new String[]{"永恒之森", "魔法师"});
        set.add(hero);
        hero = new Hero("战争之影", 2, new String[]{"永恒之森", "重装战士"});
        set.add(hero);
        hero = new Hero("影流之主", 2, new String[]{"忍者", "夜影"});
        set.add(hero);
        hero = new Hero("皮城执法官", 2, new String[]{"三国猛将", "斗士"});
        set.add(hero);
        hero = new Hero("魂锁典狱长", 2, new String[]{"灵魂莲华夜幽", "重装战士"});
        set.add(hero);
        hero = new Hero("解脱者", 2, new String[]{"月神", "斗士"});
        set.add(hero);
        hero = new Hero("残月之肃", 2, new String[]{"月神", "猎人"});
        set.add(hero);
        hero = new Hero("血港鬼影", 2, new String[]{"腥红之月", "刺客"});
        set.add(hero);
        hero = new Hero("德邦总管", 3, new String[]{"三国猛将", "决斗大师"});
        set.add(hero);
        hero = new Hero("雪原双子", 3, new String[]{"永恒之森", "斗士"});
        set.add(hero);
        hero = new Hero("痛苦之拥", 3, new String[]{"腥红之月", "夜影"});
        set.add(hero);
        hero = new Hero("刀锋舞者", 3, new String[]{"玉剑仙", "天神", "宗师"});
        set.add(hero);
        hero = new Hero("邪恶小法师", 3, new String[]{"永恒之森", "魔法师"});
        set.add(hero);
        hero = new Hero("不祥之刃", 3, new String[]{"三国猛将", "福星", "刺客"});
        set.add(hero);
        hero = new Hero("离群之刺", 3, new String[]{"忍者", "刺客"});
        set.add(hero);
        hero = new Hero("狂暴之心", 3, new String[]{"忍者", "神盾使"});
        set.add(hero);
        hero = new Hero("光辉女郎", 3, new String[]{"天神", "耀光使"});
        set.add(hero);
        hero = new Hero("永猎双子", 3, new String[]{"灵魂莲华明昼", "猎人"});
        set.add(hero);
        hero = new Hero("暴走萝莉", 3, new String[]{"福星", "神射手"});
        set.add(hero);
        hero = new Hero("魔法猫咪", 3, new String[]{"灵魂莲华明昼", "秘术师"});
        set.add(hero);
        hero = new Hero("复仇之矛", 3, new String[]{"腥红之月", "决斗大师"});
        set.add(hero);
        hero = new Hero("祖安怒兽", 4, new String[]{"天神", "斗士", "猎人"});
        set.add(hero);
        hero = new Hero("寒冰射手", 4, new String[]{"永恒之森", "猎人"});
        set.add(hero);
        hero = new Hero("堕落天使", 4, new String[]{"玉剑仙", "耀光使"});
        set.add(hero);
        hero = new Hero("痛苦之拥", 4, new String[]{"灵魂莲华夜幽", "秘术师"});
        set.add(hero);
        hero = new Hero("刀锋之影", 4, new String[]{"玉剑仙", "刺客"});
        set.add(hero);
        hero = new Hero("放逐之刃", 4, new String[]{"灵魂莲华夜幽", "神盾使"});
        set.add(hero);
        hero = new Hero("暮光之眼", 4, new String[]{"忍者", "宗师", "秘术师"});
        set.add(hero);
        hero = new Hero("九尾妖狐", 4, new String[]{"灵魂莲华明昼", "魔法师"});
        set.add(hero);
        hero = new Hero("北地之怒", 4, new String[]{"福星", "重装战士"});
        set.add(hero);
        hero = new Hero("戏命师", 4, new String[]{"猩红之月", "神射手"});
        set.add(hero);
        hero = new Hero("暗裔剑魔", 4, new String[]{"腥红之月", "重装战士"});
        set.add(hero);
        hero = new Hero("时光守护者", 5, new String[]{"猩红之月", "秘术师"});
        set.add(hero);
        hero = new Hero("盲僧", 5, new String[]{"天神", "决斗大师"});
        set.add(hero);
        hero = new Hero("探险家", 5, new String[]{"永恒之森", "耀光使"});
        set.add(hero);
        hero = new Hero("影流之主", 5, new String[]{"天煞", "夜影"});
        set.add(hero);
        hero = new Hero("沙漠皇帝", 5, new String[]{"三国猛将", "神盾使", "枭雄"});
        set.add(hero);
        hero = new Hero("封魔剑魂", 5, new String[]{"浪人", "宗师"});
        set.add(hero);
        hero = new Hero("腕豪", 5, new String[]{"霸王", "斗士"});
        set.add(hero);
        hero = new Hero("含羞蓓蕾", 5, new String[]{"灵魂莲华夜幽", "魔法师"});
        set.add(hero);

        Hero[] array = set.toArray(new Hero[0]);
        return array;
    }

    /**
     * 初始化 Hero 池
     *
     * @return
     */
    public static Map<String, Set<Hero>> initHero(String heroName) {
        Map<String, Set<Hero>> map = new HashMap<String, Set<Hero>>();
        Set<Hero> mainSet = new HashSet<Hero>();//主选英雄
        Set<Hero> supSet = new HashSet<Hero>();//候选英雄

        Set<Hero> set = new HashSet<Hero>();
        Hero hero = null;

        hero = new Hero("卡牌大师", 1, new String[]{"腥红之月", "魔法师"});
        set.add(hero);
        hero = new Hero("扭曲树精", 1, new String[]{"永恒之森", "斗士"});
        set.add(hero);
        hero = new Hero("蜘蛛女皇", 1, new String[]{"腥红之月", "神盾使"});
        set.add(hero);
        hero = new Hero("齐天大圣", 1, new String[]{"天神", "重装战士"});
        set.add(hero);
        hero = new Hero("暗夜猎手", 1, new String[]{"灵魂莲华夜幽", "神射手"});
        set.add(hero);
        hero = new Hero("狂野女猎手", 1, new String[]{"三国猛将", "神射手"});
        set.add(hero);
        hero = new Hero("德玛西亚之力", 1, new String[]{"三国猛将", "重装战士"});
        set.add(hero);
        hero = new Hero("无双剑姬", 1, new String[]{"玉剑仙", "决斗大师"});
        set.add(hero);
        hero = new Hero("冰霜女巫", 1, new String[]{"月神", "耀光使"});
        set.add(hero);
        hero = new Hero("皎月女神", 1, new String[]{"月神", "刺客"});
        set.add(hero);
        hero = new Hero("疾风剑豪", 1, new String[]{"浪人", "决斗大师"});
        set.add(hero);
        hero = new Hero("河流之主", 1, new String[]{"福星", "斗士"});
        set.add(hero);
        hero = new Hero("唤潮鲛姬", 1, new String[]{"玉剑仙", "魔法师"});
        set.add(hero);
        hero = new Hero("黑暗之女", 2, new String[]{"福星", "魔法师"});
        set.add(hero);
        hero = new Hero("迅捷斥候", 2, new String[]{"灵魂莲华明昼", "神射手"});
        set.add(hero);
        hero = new Hero("武器大师", 2, new String[]{"天神", "决斗大师"});
        set.add(hero);
        hero = new Hero("风暴之怒", 2, new String[]{"玉剑仙", "秘术师"});
        set.add(hero);
        hero = new Hero("德玛西亚皇子", 2, new String[]{"三国猛将", "神盾使"});
        set.add(hero);
        hero = new Hero("仙灵女巫", 2, new String[]{"永恒之森", "魔法师"});
        set.add(hero);
        hero = new Hero("战争之影", 2, new String[]{"永恒之森", "重装战士"});
        set.add(hero);
        hero = new Hero("影流之主", 2, new String[]{"忍者", "夜影"});
        set.add(hero);
        hero = new Hero("皮城执法官", 2, new String[]{"三国猛将", "斗士"});
        set.add(hero);
        hero = new Hero("魂锁典狱长", 2, new String[]{"灵魂莲华夜幽", "重装战士"});
        set.add(hero);
        hero = new Hero("解脱者", 2, new String[]{"月神", "斗士"});
        set.add(hero);
        hero = new Hero("残月之肃", 2, new String[]{"月神", "猎人"});
        set.add(hero);
        hero = new Hero("血港鬼影", 2, new String[]{"腥红之月", "刺客"});
        set.add(hero);
        hero = new Hero("德邦总管", 3, new String[]{"三国猛将", "决斗大师"});
        set.add(hero);
        hero = new Hero("雪原双子", 3, new String[]{"永恒之森", "斗士"});
        set.add(hero);
        hero = new Hero("痛苦之拥", 3, new String[]{"腥红之月", "夜影"});
        set.add(hero);
        hero = new Hero("刀锋舞者", 3, new String[]{"玉剑仙", "天神", "宗师"});
        set.add(hero);
        hero = new Hero("邪恶小法师", 3, new String[]{"永恒之森", "魔法师"});
        set.add(hero);
        hero = new Hero("不祥之刃", 3, new String[]{"三国猛将", "福星", "刺客"});
        set.add(hero);
        hero = new Hero("离群之刺", 3, new String[]{"忍者", "刺客"});
        set.add(hero);
        hero = new Hero("狂暴之心", 3, new String[]{"忍者", "神盾使"});
        set.add(hero);
        hero = new Hero("光辉女郎", 3, new String[]{"天神", "耀光使"});
        set.add(hero);
        hero = new Hero("永猎双子", 3, new String[]{"灵魂莲华明昼", "猎人"});
        set.add(hero);
        hero = new Hero("暴走萝莉", 3, new String[]{"福星", "神射手"});
        set.add(hero);
        hero = new Hero("魔法猫咪", 3, new String[]{"灵魂莲华明昼", "秘术师"});
        set.add(hero);
        hero = new Hero("复仇之矛", 3, new String[]{"腥红之月", "决斗大师"});
        set.add(hero);
        hero = new Hero("祖安怒兽", 4, new String[]{"天神", "斗士", "猎人"});
        set.add(hero);
        hero = new Hero("寒冰射手", 4, new String[]{"永恒之森", "猎人"});
        set.add(hero);
        hero = new Hero("堕落天使", 4, new String[]{"玉剑仙", "耀光使"});
        set.add(hero);
        hero = new Hero("痛苦之拥", 4, new String[]{"灵魂莲华夜幽", "秘术师"});
        set.add(hero);
        hero = new Hero("刀锋之影", 4, new String[]{"玉剑仙", "刺客"});
        set.add(hero);
        hero = new Hero("放逐之刃", 4, new String[]{"灵魂莲华夜幽", "神盾使"});
        set.add(hero);
        hero = new Hero("暮光之眼", 4, new String[]{"忍者", "宗师", "秘术师"});
        set.add(hero);
        hero = new Hero("九尾妖狐", 4, new String[]{"灵魂莲华明昼", "魔法师"});
        set.add(hero);
        hero = new Hero("北地之怒", 4, new String[]{"福星", "重装战士"});
        set.add(hero);
        hero = new Hero("戏命师", 4, new String[]{"猩红之月", "神射手"});
        set.add(hero);
        hero = new Hero("暗裔剑魔", 4, new String[]{"腥红之月", "重装战士"});
        set.add(hero);
        hero = new Hero("时光守护者", 5, new String[]{"猩红之月", "秘术师"});
        set.add(hero);
        hero = new Hero("盲僧", 5, new String[]{"天神", "决斗大师"});
        set.add(hero);
        hero = new Hero("探险家", 5, new String[]{"永恒之森", "耀光使"});
        set.add(hero);
        hero = new Hero("影流之主", 5, new String[]{"天煞", "夜影"});
        set.add(hero);
        hero = new Hero("沙漠皇帝", 5, new String[]{"三国猛将", "神盾使", "枭雄"});
        set.add(hero);
        hero = new Hero("封魔剑魂", 5, new String[]{"浪人", "宗师"});
        set.add(hero);
        hero = new Hero("腕豪", 5, new String[]{"霸王", "斗士"});
        set.add(hero);
        hero = new Hero("含羞蓓蕾", 5, new String[]{"灵魂莲华夜幽", "魔法师"});
        set.add(hero);

        set.forEach(e -> {
            if (Objects.equals(heroName, e.getName())) {
                mainSet.add(e);
            } else {
                supSet.add(e);
            }
        });

        map.put("main", mainSet);
        map.put("sup", mainSet);

        return map;
    }

    /**
     * 按条件过滤 英雄组合
     *
     * @param map
     * @param fetters       羁绊
     * @param amount        羁绊数量
     * @param combineAmount 羁绊组合数量
     * @return
     */
    public static Map<String, Integer> filterMapCondition(Map<String, Integer> map, String fetters, Integer amount, Integer combineAmount) {
        AtomicInteger cnt = new AtomicInteger();
        map.forEach((k, v) -> {
            if (HeroCombination.effect.containsKey(k) && ((v >= HeroCombination.effect.get(k).get(0) && !Objects.equals("忍者", k))
                    || (Objects.equals("忍者", k) && (v == 1 || v == 4)))) {//触发组合效果
                cnt.getAndIncrement();
            }
        });
        Map<String, Integer> filterMap = new HashMap<String, Integer>();
        if (cnt.get() >= combineAmount) {
            filterMap = map.entrySet().stream()
                    .filter(e -> (!Objects.nonNull(fetters) || Objects.equals(e.getKey(), fetters))
                            && (!Objects.nonNull(amount) || e.getValue() >= amount)
                    ).collect(Collectors.toMap(
                            e -> (String) e.getKey(),
                            e -> (Integer) e.getValue()
                    ));
        }

        return filterMap;
    }

}
