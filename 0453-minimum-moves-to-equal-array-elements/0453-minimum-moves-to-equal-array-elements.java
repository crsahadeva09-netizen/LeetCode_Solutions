class Solution {
    public int minMoves(int[] nums) {

        long res = 0;
        int mini = nums[0];

        for(int i=0; i<nums.length; i++){
            mini = Math.min(mini, nums[i]);
        }

        for(int i=0; i<nums.length; i++){
            res += (long) nums[i] - mini;
        }

        return (int)res;
        
    }
}