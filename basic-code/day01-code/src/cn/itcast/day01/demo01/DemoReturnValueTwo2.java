package cn.itcast.day01.demo01;

public class DemoReturnValueTwo2 {
    static int myMethod(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z =myMethod(5,9);
        System.out.println(z);

    }
}
