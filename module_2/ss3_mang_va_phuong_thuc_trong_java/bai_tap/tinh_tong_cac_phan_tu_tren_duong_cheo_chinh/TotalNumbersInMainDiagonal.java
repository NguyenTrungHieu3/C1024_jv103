import java.util.Scanner;

public class TotalNumbersInMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows (columns) of the square matrix: ");
        int size = sc.nextInt();
        double[][] matrix = new double[size][size];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter the element a[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        double totalNumbersInMainDiagonal = 0;
        for (int i = 0; i < size; i++) {
            totalNumbersInMainDiagonal += matrix[i][i];
        }
        System.out.println("The total number in main diagonal is: " + totalNumbersInMainDiagonal);
    }
}
