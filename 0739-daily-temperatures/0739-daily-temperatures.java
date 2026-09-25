class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<ans.length; i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int top = st.pop();
                ans[top] = i-top;
            }
            st.push(i);
        }

        return ans;
        
    }   
}