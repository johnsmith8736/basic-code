package cn.itcast.day01.demo01;

import java.sql.SQLOutput;

public class DemoJavaContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10;i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
