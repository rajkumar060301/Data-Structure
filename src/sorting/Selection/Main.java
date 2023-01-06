package sorting.Selection;/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 18 version
 * Date: 20-Jun-22
 */

import static sorting.Selection.SelectionSort.selectionSort;

;

public abstract class Main {
    public static void main(String[] args) {
        SelectionSort selection = new SelectionSort();
        int[] array = new int[]{35, 6, 79, 85, 5, 82, 75, 34, 1, 73};
        selectionSort(array);
        selection.printArray(array);
    }

}
