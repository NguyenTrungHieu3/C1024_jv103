import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Giải phương trình bậc hai: ax^2 + bx + c = 0 ----------");
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có 1 nghiệm x = " + (float) (-c / b));
            }
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.println("x1 = " + (-b + Math.sqrt(delta)) / 2 * a);
                System.out.println("x2 = " + (-b - Math.sqrt(delta)) / 2 * a);
            } else {
                System.out.println("Phương trình có nghiệm kép: x =" + (-b / 2 * a));
            }
        }
    }
}
