class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        ArrayList<Integer> arr = new ArrayList<>();

        int targetCount = 0;
        int lttCount = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<target)
                lttCount++;
            if(nums[i] == target)
                targetCount++;
        }

        for(int i=0; i<targetCount; i++){
            arr.add(lttCount+i);
        }

        return arr;

    }
}