package array;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 10-Jan-23
 */public class ExcepetionArray {
    public static int findExceptionArray(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != temp)
                return arr[i];
        }
        return temp;

    }

    public static void main(String[] args) {
        int[] arr = {78, 65, 98, 65, 78};
        System.out.println(findExceptionArray(arr));

    }
}
