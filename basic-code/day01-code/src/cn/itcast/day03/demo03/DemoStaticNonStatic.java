package cn.itcast.day03.demo03;

public class DemoStaticNonStatic {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod();
        DemoStaticNonStatic myObj = new DemoStaticNonStatic();
        myObj.myPublicMethod();
    }
}
