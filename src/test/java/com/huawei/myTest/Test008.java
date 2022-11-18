package com.huawei.myTest;

import java.math.BigDecimal;

public class Test008 {
    public static void main(String[] args) {
        Double total = Double.parseDouble("19.9");
        Double total2 = Double.valueOf("19.9");
        //可以看到19.9的字符串使用Double.valueOf转为double是没啥问题的
//        System.out.println("total======"+total);
//        System.out.println("tota2======"+total2);
        String money = String.valueOf(total * 100);

        BigDecimal money2 = BigDecimal.valueOf(total2);
        // 将temp乘以100
        money2 = money2.multiply(BigDecimal.valueOf(100));
//        System.out.println("money======"+money);//这是使用转换后的double做了类似乘100这样的算术运算  可以看到发生了精度损失。
//        System.out.println("money2======"+money2);//这个用BigDecimal没有损失精度
        int money3 = money2.intValue();
//        System.out.println(money3);

        Double a = Double.valueOf("1399.99");
        System.out.println(a);
        BigDecimal b = BigDecimal.valueOf(a);
        System.out.println(b);
        b = b.multiply(BigDecimal.valueOf(100));
        System.out.println(b);
        int c = b.intValue();
        System.out.println(c);

    }
}
