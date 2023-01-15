package array;

import java.util.Scanner;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 15-Jan-23
 */public class WhileLoopArray {
    public static void main(String[] args) {
        System.out.println("size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
            i++;
        }

    }
}
