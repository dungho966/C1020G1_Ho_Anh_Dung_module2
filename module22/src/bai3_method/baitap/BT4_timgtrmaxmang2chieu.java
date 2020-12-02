package bai3_method.baitap;
import java.util.Scanner;
import java.util.Arrays;
public class BT4_timgtrmaxmang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập kích thước của mảng, nhập hàng và cột : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] numbers = new int[rows][cols];
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("numbers[" + i + "][" + j + "] : ");
                numbers[i][j] =  scanner.nextInt();

                if(max < numbers[i][j]){
                    max = numbers[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // print the matrix to screen
        for(int i = 0; i < rows; i++){
            System.out.println(Arrays.toString(numbers[i]));
        }

        System.out.println("giá trị lớn nhất là:  " + max + " tại vị trí (" + maxRow + ";" + maxCol + ")");
    }
}
