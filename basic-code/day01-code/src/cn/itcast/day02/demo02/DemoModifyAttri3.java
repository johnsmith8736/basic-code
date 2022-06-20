package cn.itcast.day02.demo02;

public class DemoModifyAttri3 {
    int x = 5;

    public static void main(String[] args) {
        DemoModifyAttri3 myObj1 = new DemoModifyAttri3();
        DemoModifyAttri3 myObj2 = new DemoModifyAttri3();
        myObj2.x = 40;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
