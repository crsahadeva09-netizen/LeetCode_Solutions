class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int prefixSum = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            if(m.containsKey(prefixSum-k)){
                cnt += m.get(prefixSum-k);
            }
            m.put(prefixSum, m.getOrDefault(prefixSum, 0)+1);
        }

        return cnt;
        
    }
}