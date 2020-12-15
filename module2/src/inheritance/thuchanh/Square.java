package inheritance.thuchanh;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square(){
    }
    public Square(double side){
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public String toString(){
        return "A Square with side= "+this.side+", which is a subclass of "+super.toString();
    }
}
