import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        if (password.matches(".*[a-z].*")) {
            score++;
        }

        if (password.matches(".*\\d.*")) {
            score++;
        }

        if (password.matches(".*[!@#$%^&*()].*")) {
            score++;
        }

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Weak Password");
        } else if (score <= 4) {
            System.out.println("Medium Password");
        } else {
            System.out.println("Strong Password");
        }

        sc.close();
    }
}