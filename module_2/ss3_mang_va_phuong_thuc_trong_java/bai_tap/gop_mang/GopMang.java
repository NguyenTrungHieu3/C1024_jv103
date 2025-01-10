import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array 1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of the array 2: ");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        System.out.println("Enter array 1:");
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element a[" + i + "] : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2:");
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element a[" + i + "] : ");
            arr2[i] = sc.nextInt();
        }

        System.out.println("The array1 is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println("\nThe array2 is: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }
        System.out.println("The new array is: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
    }
}
