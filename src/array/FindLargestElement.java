package array;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 09-Jan-23
 */public class FindLargestElement {

    public static int findLargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {78, 65, 73, 45, 74, 36, 91};
        System.out.println(findLargestElement(arr));
    }
}
