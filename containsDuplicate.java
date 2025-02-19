import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static boolean contains(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        // Running test cases
        System.out.println(contains(nums1)); // Output: true
        System.out.println(contains(nums2)); // Output: false
        System.out.println(contains(nums3)); // Output: true
    }
}
