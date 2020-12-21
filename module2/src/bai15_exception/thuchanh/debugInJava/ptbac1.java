package bai15_exception.thuchanh.debugInJava;

import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        System.out.println("giai phuong trinh bac nhat");

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap a: ");
        double a = scanner.nextDouble();

        System.out.println("nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0){
            System.out.println("pt vo so nghiem");
        } else {
            double nghiem = -b/a ;
            System.out.println("nghiem cua pt la :  " +nghiem);
        }

    }

}
