package cn.itcast.day02.demo02;

public class DemoMethodPara {
    static void myMethod(String fname) {
        System.out.println(fname + " Chan");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
