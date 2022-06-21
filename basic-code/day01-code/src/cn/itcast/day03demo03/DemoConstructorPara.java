package cn.itcast.day03demo03;

public class DemoConstructorPara {
    int x;
    public DemoConstructorPara(int y) {
        x = y;
    }

    public static void main(String[] args) {
        DemoConstructorPara myObj = new DemoConstructorPara(5);
        System.out.println(myObj.x);
    }
}
