// import java.util.Scanner;

//  class input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         System.out.println(age);
//     }
// }
import java.util.Scanner;

class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(age);

        // String (One Word)
        String name = sc.next();
        System.out.println("Your name is :" + name);

        sc.nextLine();  // trap

        // String (whole sentence)
        String name2 = sc.nextLine();
        System.out.println("Your full name is :" + name2);

        sc.close();
    }
}
