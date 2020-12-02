package bai2_loopandarray.baitap;
import java.util.Scanner;
public class bt2_hienthihinh {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int choice;
                Scanner input = new Scanner(System.in);
                System.out.println("Menu");
                System.out.println("1.Print the rectangle ");
                System.out.println("2.Print the square triangle");
                System.out.println("3.Print isosceles triangle");
                System.out.println("4.Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 6; j++) {
                                System.out.print(" * ");
                            }
                            System.out.print("\n");
                        }
                        break;
                    }
                    case 2: {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                if (j < (7 - 1 - i)) {
                                    System.out.print("");
                                    continue;
                                }
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.println();
                        for (int i = 0; i < 7; i++) {
                            for (int j = 7; j < 7; j++) {
                                System.out.print("*");
                            }
                            System.out.print(" \n");
                        }
                        System.out.println();
                        for (int i = 0; i < 7; i++) {
                            for (int j = 6; j >= 0; j--) {
                                if (j > (7 - 1 - i)) {
                                    System.out.print(" ");
                                    continue;
                                }
                                System.out.print(" * ");
                            }
                            System.out.print(" \n");
                        }
                        break;
                    }
                    case 3: {
                        for (int i = 0; i < 7; i++) {
                            for (int j = 0; j < 7; j++) {
                                if (j < (7 - 1 - i)) {
                                    System.out.print(" ");
                                    continue;
                                }
                                System.out.print(" * ");
                            }
                            for (int j = 1; j <= 1; j++) {
                                System.out.print(" *");
                            }
                            System.out.print(" \n");
                        }
                        break;
                    }
                    case 0: {
                        System.exit(0);
//                default:
//                    System.out.println(" No choice");
                    }
                }
                while (choice != 0) {
                }
            }
        }

