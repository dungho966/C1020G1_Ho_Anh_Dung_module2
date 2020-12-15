package inheritance.baitap;

public class TestShape {
    public static void main(String[] args) {
        Shape shape ;
        shape = new Shape();
        System.out.println(shape);

        shape.setColor("red");
        System.out.println(shape);
    }
}
