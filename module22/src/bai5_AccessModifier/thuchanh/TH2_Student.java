package bai5_AccessModifier.thuchanh;

public class TH2_Student {
    public static void main(String[] args) {

    }
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    //constructor to initialize the variable
    TH2_Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //static method to change the value of static variable
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
