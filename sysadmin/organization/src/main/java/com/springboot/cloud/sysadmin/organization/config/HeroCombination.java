package com.springboot.cloud.sysadmin.organization.config;

import java.util.*;

public class HeroCombination {
    public static Stack<Hero> stack = new Stack<Hero>();
    public static Map<String, List<Integer>> effect = new HashMap<String, List<Integer>>();
    public static Stack<Hero> stackCal = new Stack<Hero>();
    public static List<Set<Hero>> supSetList = new ArrayList<Set<Hero>>();//候选的英雄 数组
    public static Set<Hero> supSet = new HashSet<Hero>();

    private static int count = 0;

    public static String featureName = "腥红之月";
    public static Integer heroAmount = 8;//英雄数量
    public static Integer amount = 6;//羁绊数量
    public static Integer combineAmount = 5;//羁绊组合数量

    public static void main(String[] args) {
        HeroCombination.effect = InitEffect.initEffect();//初始化羁绊特效
//        Hero[] heroes = InitHero.initHero();//初始化英雄池
        Map<String, Set<Hero>> heroes = InitHero.initHero(featureName);//初始化英雄池
        combineCal(heroes.get("sup").toArray(new Hero[0]), heroes.get("main").size() - amount, 0, 0); // 选出候选英雄
        Set<Hero> heroSet = null;
        for (Set<Hero> set : supSetList) {
            heroSet = new HashSet<Hero>() {{
                addAll(heroes.get("main"));
            }};
            heroSet.addAll(set);
            Hero[] heroeArray = heroSet.toArray(new Hero[0]);
            combine(heroeArray, heroAmount, 0, 0); // 从英雄池数组中选择N个英雄
        }
        System.out.println("组合次数：" + HeroCombination.count);
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
            Map<String, Integer> filterMap = InitHero.filterMapCondition(map, featureName, amount, combineAmount);

            filterMap.forEach((k, v) -> {
                InitHero.printHeroFetters(stack);
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

    /**
     * @param array        元素
     * @param toPickNum    要选多少个元素
     * @param selectedNum  当前有多少个元素
     * @param currentIndex 当前选到的下标
     */
    private static void combineCal(Hero[] array, int toPickNum, int selectedNum, int currentIndex) {
        if (selectedNum == toPickNum) {
            supSet = new HashSet<Hero>();
            stackCal.forEach(e -> {
                supSet.add(e);
            });
            supSetList.add(supSet);
            return;
        }

        for (int i = currentIndex; i < array.length; i++) {
            if (!stackCal.contains(array[i])) {
                stackCal.add(array[i]);
                combineCal(array, toPickNum, selectedNum + 1, i);
                stackCal.pop();
            }
        }
    }

}
