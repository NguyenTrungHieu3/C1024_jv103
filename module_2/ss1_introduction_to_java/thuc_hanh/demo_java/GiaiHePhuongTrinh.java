import java.util.Scanner;

public class GiaiHePhuongTrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Giải hệ phương trình: ax + by = c, mx + ny = g ----------");
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        System.out.println("Nhập m: ");
        int m = sc.nextInt();
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("Nhập g: ");
        int g = sc.nextInt();

        // a    b  |  c
        // m    n  |  g
        double D = a * n - b * m;
        double Dx = c * n - b * g;
        double Dy = a * g - c * m;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("Hệ phương trình có vô số nghiệm");
            } else {
                System.out.println("Hệ phương trình vô nghiệm");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("Hệ phương trình có nghiệm duy nhất:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
