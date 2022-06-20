package cn.itcast.day02.demo02;

public class DemoAcessMethod {
    public void fulleThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
       System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        DemoAcessMethod myCar = new DemoAcessMethod();
        myCar.fulleThrottle();
        myCar.speed(100);
    }
}
