package bai5_AccessModifier.baitap;

public class BT1_AccessModifier {
    private double radius = 1;
    private String color = "red" ;

    public BT1_AccessModifier(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }
}


