package bai2_loopandarray.baitap;
import java.util.Scanner;
public class bt1_songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count;
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        count = 0;
        int N = 2;
        Boolean check = false;
        while (count < a) {
            for (int i = 2; i < Math.sqrt(N); i++) {
                check = false;
                if (N % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(N + "  is prime");
                count++;
            }
            N++;
        }
        {
            {
            }
        }
    }
}


