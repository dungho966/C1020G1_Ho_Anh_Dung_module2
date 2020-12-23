package bai11_DSA_Stack_queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so dang thap phan:  ");
        int a= scanner.nextInt();
        Stack<Integer> decimal = new Stack<>() ;
        int thuong = a/2;
        int sodu = a%2 ;

        decimal.push(sodu);


        while (thuong != 0){
            sodu = thuong%2 ;
            thuong = thuong/2 ;
            decimal.push(sodu);
        }

        while (!decimal.isEmpty()){
            System.out.println(decimal.pop());
        }

    }
}
