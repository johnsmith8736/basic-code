package cn.itcast.day03demo03;

public class DemoMultiAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        DemoMultiAttributes myObj = new DemoMultiAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
