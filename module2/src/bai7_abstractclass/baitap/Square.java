package bai7_abstractclass.baitap;

public abstract class Square extends Shape implements Colorable{
    public String howToColor(){
        return " Color all four sides";
    }

    @Override
    public double getArea() {
        return 0;
    }
}
