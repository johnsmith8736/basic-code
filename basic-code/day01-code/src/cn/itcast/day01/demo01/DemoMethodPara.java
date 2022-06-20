package cn.itcast.day01.demo01;

public class DemoMethodPara {
    static void myMethod(String fname) {
        System.out.println(fname + " Redsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
