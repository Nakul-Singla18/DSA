class Solution {
    public int minIncrementForUnique(int[] nums) {
          Arrays.sort(nums);
        int moves = 0;
        int prev = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= prev) {
                prev++;
                moves += prev - nums[i];
            } else {
                prev = nums[i];
            }
        }
        
        return moves;
    }
}
