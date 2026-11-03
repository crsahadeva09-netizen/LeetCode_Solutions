class Solution {
    public int minMoves(int[] nums) {

        int maxi = nums[0];
        
        for(int i=0; i<nums.length; i++){
            maxi = Math.max(maxi, nums[i]);
        }

        int res = 0;

        for(int i=0; i<nums.length; i++){
            res += maxi-nums[i];
        }

        return res;

    }
}