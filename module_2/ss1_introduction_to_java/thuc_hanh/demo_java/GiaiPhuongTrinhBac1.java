import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------ ax + b = 0 ---------------");
        System.out.println("Nhập a:");
        int a = sc.nextInt();
        System.out.println("Nhập b:");
        int b = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            // ep kieu tuong minh
            double x = (double) -b / a;
            System.out.println("Phương trình có nghiệm là: x = " + x);
        }
    }
}
