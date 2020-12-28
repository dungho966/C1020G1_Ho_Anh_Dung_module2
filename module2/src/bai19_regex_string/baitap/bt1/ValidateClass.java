package bai19_regex_string.baitap.bt1;

import java.security.SecureRandom;
import java.util.Scanner;

public class ValidateClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Class (example: C1020G) : ");
        String a = scanner.nextLine();

        String regex = "[C|A|P][0-9]{4}[G|H|I|K|L|M]";
        System.out.println(a.matches(regex));


    }


}
