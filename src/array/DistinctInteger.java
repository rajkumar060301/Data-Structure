package array;

/*
 * Author Name: Raj Kumar
 * IDE: IntelliJ IDEA Ultimate Edition
 * JDK: 19 version
 * Date: 11-Jan-23
 */public class DistinctInteger {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target || nums[i] > target)
                return i;

        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = {10, 78, 85, 98};
        int target = 85;
        System.out.println(searchInsert(arr, target));

    }
}
