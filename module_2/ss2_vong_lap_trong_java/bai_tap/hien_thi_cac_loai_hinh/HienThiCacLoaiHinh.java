import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int subChoice = -1;
                    while (subChoice != 0) {
                        System.out.println("Menu");
                        System.out.println("1. Draw the top-left square triangle");
                        System.out.println("2. Draw the top-right square triangle");
                        System.out.println("3. Draw the botton-left square triangle");
                        System.out.println("4. Draw the botton-right square triangle");
                        System.out.println("5. Exit");
                        System.out.println("Enter your choice: ");
                        subChoice = sc.nextInt();
                        switch (subChoice) {
                            case 1:
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = i; j <= 6; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 1; j <= 6; j++) {
                                        if (j < i) {
                                            System.out.print("   ");
                                        } else {
                                            System.out.print(" * ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for (int i = 1; i <= 6; i++) {
                                    for (int j = 1; j <= 6; j++) {
                                        if (j <= 6 - i) {
                                            System.out.print("   ");
                                        } else {
                                            System.out.print(" * ");
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            case 5:
                                System.out.println("Exit submenu successful");
                                break;
                            default:
                                System.out.println("Enter your choice: ");
                                break;
                        }
                        break;
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 11; j++) {
                            if (j >= 7 - i && j <= 5 + i) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit successful");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}