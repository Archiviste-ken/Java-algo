import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nmber:");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is anEven Number");
        }

        else {

            System.out.println(num + " is an Odd Number");
        }

    }
}