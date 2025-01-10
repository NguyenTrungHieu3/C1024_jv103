import java.util.Scanner;

public class XoaPhanTuKhoiMang {
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

        System.out.println("\nEnter element want to delete: ");
        int deleteElement = sc.nextInt();

        int indexDel = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == deleteElement) {
                indexDel = i;
                break;
            }
        }

        if (indexDel == -1) {
            System.out.println("The element is not in the array");
        } else {
            for (int i = indexDel; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = 0;
            System.out.println("The array after delete element is: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
        sc.close();
    }
}
