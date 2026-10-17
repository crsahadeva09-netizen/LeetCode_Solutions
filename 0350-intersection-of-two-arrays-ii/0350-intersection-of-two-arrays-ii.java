import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                arr.add(num);
                map.put(num, map.get(num) - 1); 
            }
        }
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
}