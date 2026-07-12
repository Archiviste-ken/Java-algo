import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest = %.2f%n", compoundInterest);
        System.out.printf("Total Amount = %.2f%n", amount);

        sc.close();
    }
}