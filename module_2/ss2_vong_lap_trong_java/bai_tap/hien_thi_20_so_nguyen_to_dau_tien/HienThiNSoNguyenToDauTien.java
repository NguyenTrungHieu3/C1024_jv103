import java.util.Scanner;

public class HienThiNSoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố muốn in ra: ");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
