package inheritance.baitap;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(12.0f,132.4f,23.45f,223.3f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
