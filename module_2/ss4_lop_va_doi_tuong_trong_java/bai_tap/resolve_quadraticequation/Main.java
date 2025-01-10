import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình bậc hai (quadratic equation) ax2 + bx + x = 0.");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0.0) {
            System.out.println("x1 =" + equation.getRoot1());
            System.out.println("x2 =" + equation.getRoot2());
        } else if (delta == 0.0) {
            System.out.println("x =" + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
