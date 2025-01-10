import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("MENU. ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celcius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + celiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.out.println("Exit successfully.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (true);
    }
    public static double celiusToFahrenheit(double celsius) {
        return celsius * (9.0/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0/9) * (fahrenheit - 32);
    }
}
