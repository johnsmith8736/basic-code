package cn.itcast.day03.demo03;

public class DemoMultiObjects {
    int x = 5;

    public static void main(String[] args) {
        DemoMultiObjects myObj1 = new DemoMultiObjects();
        DemoMultiObjects myObj2 = new DemoMultiObjects();
        myObj2.x = 25;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
