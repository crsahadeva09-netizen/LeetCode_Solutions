class Solution {
    public int smallestIndex(int[] nums) {

        for(int i=0; i<nums.length; i++){
            int res = 0;
            int num = nums[i];
            while(num>0){
                int temp = num%10;
                num /=  10;
                res = res+temp;
            }

            if(res==i){
                return i;
            }
        }

        return -1;
        
    }
}