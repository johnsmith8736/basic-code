package cn.itcast.day03demo03;

public class DemoAccessMehtods {
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        DemoAccessMehtods myCar= new DemoAccessMehtods();
        myCar.fullThrottle();
        myCar.speed(100);
    }
}