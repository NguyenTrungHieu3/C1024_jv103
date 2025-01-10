import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        System.out.println("Enter the number of usd: ");
        double usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("The VND value is " + vnd);
    }
}
