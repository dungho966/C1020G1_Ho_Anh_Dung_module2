package bai19_regex_string.baitap.bt1;

import java.util.Scanner;

public class ValidateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Phone Number:  ");
        String a = scanner.nextLine();

        String regex = "(\\+84|0)[0-9]{9}";
        System.out.println(a.matches(regex));



    }
}
