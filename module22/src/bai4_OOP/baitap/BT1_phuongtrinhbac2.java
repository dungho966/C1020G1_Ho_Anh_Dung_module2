package bai4_OOP.baitap;

import java.util.Scanner;

public class BT1_phuongtrinhbac2 {
   private int a,b,c;

public BT1_phuongtrinhbac2(int a, int b , int c){
    this.a = a;
    this.b = b;
    this.c = c;
}

public double getDiscriminant(){
    return b*b - 4 * a * c ;
}
public double getRoot1() {
    double delta = getDiscriminant();
    return ((b*(-1) + Math.sqrt(delta))/(2*a));
}
public double getRoot2() {
    double delta = getDiscriminant();
    return ((b*(-1) - Math.sqrt(delta))/(2*a));
}

public void getroot(){
    double delta = getDiscriminant();

    if (delta < 0){
        System.out.println("phuong trinh vo nghiem");
    }else if (delta==0) {
        System.out.println("phuong trinh co 1 nghiem:" +getRoot1());
    }else {
        System.out.println("phuong trinh co 2 nghiem la: " +getRoot1()+ "va" +getRoot2());
    }
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a:");
    int a = scanner.nextInt();
    System.out.println("nhap b:");
    int b = scanner.nextInt();
    System.out.println("nhap c:");
    int c = scanner.nextInt();

    BT1_phuongtrinhbac2 d = new BT1_phuongtrinhbac2(a,b,c);
    d.getroot();
}
}


