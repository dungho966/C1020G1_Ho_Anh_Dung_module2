package bai3_method.baitap;
import java.util.Scanner;
import java.util.Arrays;
public class BT5_timmintrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++){
            System.out.print("numbers[" + i + "] : ");
            numbers[i] = scanner.nextInt();

            if(min > numbers[i])
                min = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("The min value : " + min);


        scanner.close();
    }
}
