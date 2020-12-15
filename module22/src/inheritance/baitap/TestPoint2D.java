package inheritance.baitap;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D ;
        point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3,5);
        System.out.println(point2D);

        point2D.setXY(4,6);
        System.out.println(point2D);
    }
}
