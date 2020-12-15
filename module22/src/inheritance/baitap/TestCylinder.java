package inheritance.baitap;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder;
        cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3 , "red" , 2);
        System.out.println(cylinder);
    }
}
