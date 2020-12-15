package inheritance.baitap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle ;
        circle = new Circle();

        circle = new Circle(5,"yellow");
        System.out.println(circle);
    }
}
