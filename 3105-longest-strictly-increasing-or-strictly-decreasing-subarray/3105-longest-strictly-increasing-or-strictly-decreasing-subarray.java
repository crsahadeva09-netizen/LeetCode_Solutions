class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int sI = 1;
        int sD = 1;

        for(int i=0; i<nums.length-1; i++){
            int x = 1;
            int a = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>a){
                    x++;
                    a = nums[j];
                }else
                    break;
            }
            sI = Math.max(sI, x);
        }

        for(int i=0; i<nums.length-1; i++){
            int x = 1;
            int a = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<a){
                    x++;
                    a = nums[j];
                }else
                    break;
            }
            sD = Math.max(sD, x);
        }

        return Math.max(sI, sD);
        
    }
}