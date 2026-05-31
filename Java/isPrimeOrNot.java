import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num <= 1) {
            System.out.println("Not a Prime Number");
        }     
        else {
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(num + " is Prime");
            }
            else {
                System.out.println(num + " is Not Prime");
            }
        }
    }
}