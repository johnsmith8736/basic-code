package cn.itcast.day03.demo03;

public class DemoJavaConstructors {
    int x;
    public DemoJavaConstructors() {
        x = 5;
    }

    public static void main(String[] args) {
        DemoJavaConstructors myObj = new DemoJavaConstructors();
        System.out.println(myObj.x);
    }
}
