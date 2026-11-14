class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int res = Integer.MAX_VALUE;

        for(int i=0; i<nums.size(); i++){
            int sum = nums.get(i);
            if(l==1 && sum>0){
                res = Math.min(res, sum);
            }
            for(int j=i+1; j<nums.size(); j++){
                sum += nums.get(j);
                if(j-i+1>=l && j-i+1<=r && sum>0){
                    res = Math.min(res, sum);
                }
            }
        }

        if(res == Integer.MAX_VALUE)
            return -1;


        return res;

    }
}