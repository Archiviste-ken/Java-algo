import java.util.Scanner;

public class bossUsingWhile {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int n = sc.nextInt();
        
        int i = 0;

        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println(sum);
        sc.close();

    }

}
