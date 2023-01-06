package sorting.Bubble;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-Jun-22
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int ans(int num1, int num2) {
        String str = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        int mid1 = str.length() / 2;
        int mid2 = str2.length() / 2;
        if (Integer.parseInt(String.valueOf(str.charAt(mid1))) > Integer.parseInt(String.valueOf(str2.charAt(mid2)))) {
            return 1;
        } else if (Integer.parseInt(String.valueOf(str.charAt(mid1))) < Integer.parseInt(String.valueOf(str2.charAt(mid2)))) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < n - 1; j++) {
                int res = ans(arr[j], arr[j + 1]);
                if (res == 1) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));
    }
}
