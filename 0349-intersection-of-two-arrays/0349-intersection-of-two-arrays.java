class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(res.contains(nums1[i])){
                        continue;
                    }else{
                        res.add(nums1[i]);
                    }
                }
            }
        }

        int[] result = new int[res.size()];

        for(int i=0; i<res.size(); i++){
            result[i] = res.get(i);
        }

        return result;
        
    }
}