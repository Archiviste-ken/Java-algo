// 🧩 Mini Challenge

// Write a program that:
// Reads an integer n.
// Prints all numbers from 1 to n.
// Prints whether each number is Even or Odd.
// Example:
// Input
// 5
// Output
// 1 Odd
// 2 Even
// 3 Odd
// 4 Even
// 5 Odd
import java.util.Scanner;

public class mini_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        
        for(int i = 0; i <= n; i++){

            if( i % 2 == 0){
                System.out.println("EVEN");
            }

            else
                System.out.println("ODD");
        }
        
    }
}
