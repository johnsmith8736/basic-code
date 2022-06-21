package cn.itcast.day03.demo03;

public class DemoConstructorPara2 {
    int modelYear;
    String modelName;
    public DemoConstructorPara2(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        DemoConstructorPara2 myCar = new DemoConstructorPara2(2015, "BMW");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

