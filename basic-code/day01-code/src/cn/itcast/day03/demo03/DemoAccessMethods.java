package cn.itcast.day03.demo03;

public class DemoAccessMethods {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        DemoAccessMethods myCar= new DemoAccessMethods();
        myCar.fullThrottle();
        myCar.speed(100);
    }
}
