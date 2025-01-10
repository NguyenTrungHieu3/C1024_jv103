import java.util.Scanner;

public class CountTotalNumbersInTheColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at a[" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Enter the number column want to calculate: ");
        int numberColumn = sc.nextInt();
        if (numberColumn < 0 || numberColumn > columns) {
            System.out.println("Number column out of bounds!");
        } else {
            int totalNumbersInTheColumn = 0;
            for (int i = 0; i < rows; i++) {
                totalNumbersInTheColumn += arr[i][numberColumn];
            }
            System.out.println("Total number in column " + numberColumn + " : " + totalNumbersInTheColumn);
        }
    }
}
