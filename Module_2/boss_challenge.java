// 👑 Boss Challenge

// Write a program that:
// Reads an integer n.
// Calculates the sum of all numbers from 1 to n.
// Prints the result.
// Example:
// Input
// 5
// Output
// 15
// Bonus: Can you do it using both a for loop and a while loop?
import java.util.Scanner;

public class boss_challenge {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
        sc.close();

    }

}
