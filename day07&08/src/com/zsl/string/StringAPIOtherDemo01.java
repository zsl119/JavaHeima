package com.zsl.string;

public class StringAPIOtherDemo01 {
    public static void main(String[] args) {
        String demo = "qaz123QAZ";

        //字符串长度 length()
        System.out.println(demo.length());

        //字符串某个索引处字符 charAt(index)
        System.out.println(demo.charAt(0));
        System.out.println(demo.charAt(demo.length() - 1));
        //所以可以引申到遍历字符串数组
        System.out.println("---------------------------");
        for (int i = 0; i < demo.length(); i++) {
            System.out.println(demo.charAt(i));
        }
        System.out.println("---------------------------");

        //字符串转换为字符数组并遍历 toCharArray()
        char[] chars = demo.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("---------------------------");

        //截取字符串内容 substring 包前不包后
        System.out.println(demo.substring(4)); //23QAZ
        //字符串     q a z 1 2 3 Q A Z
        //对应index：0 1 2 3 4 5 6 7 8
        System.out.println(demo.substring(4, 6));//23 包前不包后所以不包括Q

        //字符串替换 replace(target, replace)
        System.out.println(demo.replace("123", "***"));//qaz***QAZ
        //注意这时候再输出demo，会发现依旧是qaz123QAZ，这就是字符串存储不变性
        //上一行替换相当于生成了一个新的字符串qaz***QAZ
        System.out.println(demo);

        //包含关键字判断 contains(keyword)
        System.out.println(demo.contains("23Q"));//true

        //判断字符串是否以什么开始 startsWith(keyword)
        System.out.println(demo.startsWith("qaz"));//true

        //按照某个内容把字符串分割成字符串数组返回
        //例如把字符串按照&隔开
        String demo2 = "aaaaa&bbbbb&ccccc";
        String[] ch = demo2.split("&");
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }


    }
}
