package inheritance.baitap;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D ;
        point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(5,6,7);
        System.out.println(point3D);

        point3D.setXYZ(2,3,4);
        System.out.println(point3D);
    }
}
