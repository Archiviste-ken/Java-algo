// 👑 Boss Challenge

// Write a program that:
// Reads n.
// Reads an array.
// Calculates:
// Sum
// Maximum
// Minimum
// Average
// Example
// Input
// 5
// 10 20 30 40 50
// Output
// Sum = 150
// Max = 50
// Min = 10
// Average = 30.0
import java.util.Scanner;



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

        int min = findMin(arr);

        System.out.println("\n Minimum = " + min);

        int sum = findSum(arr);

        System.out.println("\n Sum = " + sum);

        int avg = findAvg(arr);

        System.out.println("\n Avg = " + avg);

        sc.close();
    }

    public static int findMax(int[] arr) {

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }

        }

        return max;

    }

    public static int findMin(int[] arr) {

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }

        }
        return min;

    }

    public static int findSum(int[] arr) {
        int sum = 0;

        for (int num : arr) {

            sum += num;

        }

        return sum;

    }

    public static int findAvg(int[] arr) {
        int avg = 0;

        for (int num : arr) {
            avg += num;
        }

        return avg / arr.length;

    }
