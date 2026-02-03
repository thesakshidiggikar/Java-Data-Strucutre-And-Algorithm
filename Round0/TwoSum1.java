import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}

public class TwoSum1 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // ⚠️ Array SORTED hona chahiye for two-pointer
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}
