package array;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 09-Jan-23
 */public class ArrayRev {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] arr = {45, 78, 13, 95, 78, 36};
        System.out.print("real array - > ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");

        }
        System.out.println();
        System.out.print("After reverse - > ");
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
