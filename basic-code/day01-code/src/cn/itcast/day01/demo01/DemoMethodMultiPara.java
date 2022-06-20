package cn.itcast.day01.demo01;

public class DemoMethodMultiPara {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " +age);
    }
    public static void main (String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny",8);
        myMethod("Anja", 31);
    }
}
