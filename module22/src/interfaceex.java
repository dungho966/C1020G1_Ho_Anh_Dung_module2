public class interfaceex {
    public static void main(String[] args) {
        animal animal = new fish();
        animal animal1 = new cat();

        animal.move();
        animal.eat();
        animal.sleep();

        animal1.sleep();
    }
}
