package cn.itcast.day01.demo01;

public class DemoJavaBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

    }
}
