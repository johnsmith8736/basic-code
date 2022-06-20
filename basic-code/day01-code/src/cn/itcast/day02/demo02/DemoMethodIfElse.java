package cn.itcast.day02.demo02;

public class DemoMethodIfElse {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not old enough to vote.");
        } else {
            System.out.println("You are old enough to vote.");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
        checkAge(18);
        checkAge(19);
    }
}
