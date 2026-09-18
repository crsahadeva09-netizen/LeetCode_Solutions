/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode build(int[] nums, int left, int right){
        if(left>right){
            return null;
        }

        // else find max element and work accordingly...
        int maxidx = left;

        for(int i=left+1; i<=right; i++){
            if(nums[i] > nums[maxidx]){
                maxidx = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxidx]);

        root.left = build(nums, left, maxidx-1);
        root.right = build(nums, maxidx+1, right);

        return root;
        
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length-1);
    }
}