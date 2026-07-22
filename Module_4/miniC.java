// 🧩 Mini Challenge

// Write a method
// countVowels(String s)
// that returns the number of vowels.
// Example
// Input
// Programming
// Output
// 3
import java.util.Scanner;

public class miniC {

    public static int countVowels(String s1) {

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {

            char ch = Character.toLowerCase(s1.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();


        System.out.println(countVowels(s1));

    }

}
