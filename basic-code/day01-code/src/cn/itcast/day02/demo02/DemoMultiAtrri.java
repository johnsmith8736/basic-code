package cn.itcast.day02.demo02;

public class DemoMultiAtrri {
    String fname = "John";
    String lname = "Doe";
    int age = 30;

    public static void main(String[] args) {
        DemoMultiAtrri myObj = new DemoMultiAtrri();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }


}
