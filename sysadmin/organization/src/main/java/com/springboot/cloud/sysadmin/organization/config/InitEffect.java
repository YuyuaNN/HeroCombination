package com.springboot.cloud.sysadmin.organization.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitEffect {
    public static Map<String, List<Integer>> effect = new HashMap<String, List<Integer>>();

    /**
     * 初始化 组合效果
     */
    public static Map<String, List<Integer>> initEffect() {
        effect.put("腥红之月", Arrays.asList(3, 6, 9));
        effect.put("天神", Arrays.asList(2, 4, 6, 8));
        effect.put("灵魂莲华夜幽", Arrays.asList(2, 4, 6));
        effect.put("永恒之森", Arrays.asList(3, 6, 9));
        effect.put("玉剑仙", Arrays.asList(2, 4, 6));
        effect.put("浪人", Arrays.asList(1, 2));
        effect.put("福星", Arrays.asList(3, 6));
        effect.put("月神", Arrays.asList(3, 5));
        effect.put("忍者", Arrays.asList(1, 4));
        effect.put("灵魂莲华明昼", Arrays.asList(2, 4));
        effect.put("霸王", Arrays.asList(1));
        effect.put("三国猛将", Arrays.asList(3, 6, 9));
        effect.put("天煞", Arrays.asList(1));
        effect.put("宗师", Arrays.asList(2, 3, 4));
        effect.put("刺客", Arrays.asList(2, 4, 6));
        effect.put("斗士", Arrays.asList(2, 4, 6, 8));
        effect.put("耀光使", Arrays.asList(2, 4));
        effect.put("决斗大师", Arrays.asList(2, 4, 6, 8));
        effect.put("猎人", Arrays.asList(2, 3, 4, 5));
        effect.put("神盾使", Arrays.asList(2, 4, 6));
        effect.put("魔法师", Arrays.asList(3, 6, 9));
        effect.put("秘术师", Arrays.asList(2, 4, 6));
        effect.put("夜影", Arrays.asList(2, 3, 4));
        effect.put("神射手", Arrays.asList(2, 4, 6));
        effect.put("重装战士", Arrays.asList(2, 4, 6, 8));
        effect.put("枭雄", Arrays.asList(1));

        return effect;
    }
}
