package bai7_abstractclass.baitap;

public abstract class TestSquare {
    public static void main(String[] args) {
        Square square = new Square() {
        };
        System.out.println(square.howToColor());
        Circle circle = new Circle();
        System.out.println( circle.howToColor());

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Square() {
        };
        shapes[2] = new Rectangle(4.5,5.7);
        for (Shape shape : shapes){
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
                System.out.println(((Colorable) shape).howToColor());
            }
            System.out.println(shape.getArea());
        }
    }
}
