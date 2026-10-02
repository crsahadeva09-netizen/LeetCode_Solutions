class Solution {
    public static void permute(int[] nums, Set<List<Integer>> s, int idx, int end){
        if(idx==end){
            List<Integer> list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            s.add(list);
            return;
        }

        for(int i=idx; i<end; i++){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            permute(nums, s, idx+1, end);
            
            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> s = new HashSet<>();

        permute(nums, s, 0, nums.length);

        return new ArrayList<>(s);
        
    }
}