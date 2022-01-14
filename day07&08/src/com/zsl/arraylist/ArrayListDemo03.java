package com.zsl.arraylist;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {
        // 创建集合对象，录入学生成绩
        // 找出低于80分的，删除
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(67);
        scores.add(77);
        scores.add(78);
        scores.add(100);
        scores.add(79);
        scores.add(76);
        scores.add(70);
        System.out.println(scores);

        // 遍历
        for (int i = 0; i < scores.size(); i++) {
            int s = scores.get(i);
            if (s < 80){
                scores.remove(i);
            }
        }

        System.out.println(scores);
        // [98, 77, 100] 结果出现了小于80的bug！！！
        // 原因是当i = 2 时发现67 < 80  于是删掉了，然后小于80的77就顶替了67的位置
        // 然而这时i = 3 跳过了77 直接来了78位置，因此77就保留了下来
        // 解决方法：倒着遍历！！！

        // 遍历
        for (int i = scores.size() - 1; i >= 0; i--) {
            int s = scores.get(i);
            if (s < 80){
                scores.remove(i);
            }
        }

        System.out.println(scores);

    }
}
