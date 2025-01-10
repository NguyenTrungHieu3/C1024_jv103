import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nEnter element want add to the array: ");
        int addElement = sc.nextInt();
        System.out.println("Enter the index want to add to the array: ");
        int addIndex = sc.nextInt();

        if (addIndex <= -1 || addIndex >= arr.length) {
            System.out.println("The index is invalid");
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                if (i < addIndex) {
                    newArr[i] = arr[i];
                } else {
                    newArr[i + 1] = arr[i];
                }
            }
            newArr[addIndex] = addElement;
            arr = newArr;
            System.out.println("The array after add element is: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
        sc.close();
    }
}
