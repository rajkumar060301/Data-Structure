package array;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 09-Jan-23
 */public class findMinNum {
    public static int findMinimumNumber(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {78, 69, 25, 34, 75, 12};
        System.out.print("my array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("minimum element is: " + findMinimumNumber(arr));

    }

}
