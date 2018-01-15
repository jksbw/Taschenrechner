import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);

        System.out.println("erste Zahl eingeben:");
        double n1 = scan.nextDouble();

        System.out.println("zweite Zahl eingeben:");
        double n2 = scan.nextDouble();

        double result = calc.addition(n1, n2);

        System.out.println(result);

        scan.close();
    }
}
