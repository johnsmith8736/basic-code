package cn.itcast.day01.demo01;

public class DemoBreakContinueWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}