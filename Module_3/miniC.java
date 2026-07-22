// 🧩 Mini Challenge

// Write a method:
// findMax(int[] arr)
// that returns the maximum element.
// Example
// Input
// 5
// 10 20 40 5 30
// Output
// 40
import java.util.Scanner;



      public static int findMax(int[] arr) {

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }

        int max = findMax(arr);

        System.out.println("\nMaximum = " + max);

        sc.close();
    }
