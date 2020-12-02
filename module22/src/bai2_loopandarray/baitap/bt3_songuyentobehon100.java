package bai2_loopandarray.baitap;
import java.util.Scanner;
public class bt3_songuyentobehon100 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                for (int N = 2 ; N <= 100; N++){
                    boolean check = false;
                    for (int i = 2 ; i <= Math.sqrt(N); i++){
                        check = false;
                        if (N % i == 0){
                            check = true ;
                            break;
                        }
                    }
                    if (!check){
                        System.out.println( N + " is prime");
                    }
                }
            }
        }
