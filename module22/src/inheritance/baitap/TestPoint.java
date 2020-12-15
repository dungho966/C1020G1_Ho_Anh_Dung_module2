package inheritance.baitap;
import java.util.Arrays;
public class TestPoint {
    public static void main(String[] args) {
        Point point;
        point = new Point();
        System.out.println(point);

        point = new Point(1,2);
        System.out.println(point);

        point.setXY(3,4);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
