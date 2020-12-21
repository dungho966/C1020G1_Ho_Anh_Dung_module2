package bai7_abstractclass.baitap;

public class Circle1 {
    private double radius = 1 ;
    private String color = "red" ;

    public Circle1(){

    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 2* Math.PI * this.radius ;
    }
}
