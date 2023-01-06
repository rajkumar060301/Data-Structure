package sorting.insertion;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-Jun-22
 */

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = new int[]{45, 78, 35, 94, 39, 78};
        insertionSort.insertionSort(array);
        insertionSort.printArray(array);
    }
}
