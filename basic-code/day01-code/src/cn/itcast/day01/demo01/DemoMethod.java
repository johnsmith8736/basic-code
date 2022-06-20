package cn.itcast.day01.demo01;

import java.sql.SQLOutput;

public class DemoMethod {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
