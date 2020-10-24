package com.springboot.cloud.sysadmin.organization.config;

import java.util.Stack;

/**
 * 数学排列公式工具类
 */
public class ArrangementUtil {
    public static Stack<Integer> stack = new Stack<Integer>();
    private static int count = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        combine(array, 3, 0, 0); // 从这个数组4个数中选择三个
        System.out.println("组合次数：" + ArrangementUtil.count);
    }

    /**
     * @param array        元素
     * @param toPickNum    要选多少个元素
     * @param selectedNum  当前有多少个元素
     * @param currentIndex 当前选到的下标
     */
    private static void combine(int[] array, int toPickNum, int selectedNum, int currentIndex) {
        if (selectedNum == toPickNum) {
            System.out.println(stack);
            ArrangementUtil.count++;
            return;
        }

        for (int i = currentIndex; i < array.length; i++) {
            if (!stack.contains(array[i])) {
                stack.add(array[i]);
                combine(array, toPickNum, selectedNum + 1, 0);
                stack.pop();
            }
        }

    }
}
