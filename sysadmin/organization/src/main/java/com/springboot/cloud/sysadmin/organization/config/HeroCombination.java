package com.springboot.cloud.sysadmin.organization.config;

import java.util.*;

public class HeroCombination {
    public static Stack<Hero> stack = new Stack<Hero>();
    public static Map<String, List<Integer>> effect = new HashMap<String, List<Integer>>();
    private static int count = 0;

    public static void main(String[] args) {
//        initEffect();
//        Hero[] heroes = CombinationUtil2.initHero();
        HeroCombination.effect = InitEffect.initEffect();
        Hero[] heroes = InitHero.initHero();
        combine(heroes, 8, 0, 0); // 从英雄池数组中选择N个英雄
        System.out.println("组合次数：" + HeroCombination.count);
    }

    /**
     * 初始化 组合效果
     */
    private static void initEffect() {
        effect.put("vier", Arrays.asList(2, 3));
        effect.put("zwei", Arrays.asList(2));
    }

    /**
     * 初始化 Hero 池
     *
     * @return
     */
    private static Hero[] initHero() {
        Set<Hero> set = new HashSet<Hero>();
        Hero hero = new Hero("张三", 1, new String[]{"eins", "zwei", "drei", "vier"});
        set.add(hero);
        hero = new Hero("李四", 2, new String[]{"zwei", "drei", "vier"});
        set.add(hero);
        hero = new Hero("王老五", 3, new String[]{"vier"});
        set.add(hero);
        Hero[] array = set.toArray(new Hero[0]);
        return array;
    }

    /**
     * @param array        元素
     * @param toPickNum    要选多少个元素
     * @param selectedNum  当前有多少个元素
     * @param currentIndex 当前选到的下标
     */
    private static void combine(Hero[] array, int toPickNum, int selectedNum, int currentIndex) {
        if (selectedNum == toPickNum) {
//            System.out.println(stack);
            Map<String, Integer> map = new HashMap<String, Integer>();
            stack.forEach(hero -> {
                hero.getFeatures().forEach(feature -> {
                    if (!map.containsKey(feature)) {
                        map.put(feature, 1);
                    } else {
                        map.put(feature, map.get(feature) + 1);
                    }
                });
            });
//            System.out.println(map);
            //按条件过滤 英雄组合
//            Map<String, Integer> filterMap = InitHero.filterMapCondition(map, null, null);
            Map<String, Integer> filterMap = InitHero.filterMapCondition(map, "腥红之月", 6, 6);

            filterMap.forEach((k, v) -> {
//                if (effect.containsKey(k) && ((v >= effect.get(k).get(0) && !Objects.equals("忍者", k))
//                        || (Objects.equals("忍者", k) && (v == 1 || v == 4)))) {//触发组合效果
//                    System.out.println(stack);
//                    System.out.println(k + ":" + v);
//                    HeroCombination.count++;
//                }
                System.out.println(stack);
                System.out.println(k + ":" + v);
                HeroCombination.count++;
            });
//            HeroCombination.count++;
            return;
        }

        for (int i = currentIndex; i < array.length; i++) {
            if (!stack.contains(array[i])) {
                stack.add(array[i]);
                combine(array, toPickNum, selectedNum + 1, i);
                stack.pop();
            }
        }

    }

}
