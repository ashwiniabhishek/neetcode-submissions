class Solution {
    public int missingNumber(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            // avoid over flow issue which is there in first calculating the sum.
            n += (i+1);
            n -= nums[i];
        }
        return n;
    }
}
