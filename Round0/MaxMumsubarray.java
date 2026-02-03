class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                int currentSum +=nums[j];
                if(currentSum>maxSum){
                    maxSum =currentSum;
                }
            }
        }
        return maxSum;
    }
}