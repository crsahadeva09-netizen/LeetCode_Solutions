class Solution {
    public String removeKdigits(String num, int k) {

        if(k>=num.length()){
            return "0";
        }
        
        Stack<Integer> st = new Stack<>();
        int i=0;

        int curr = num.charAt(i++)-'0';
        st.push(curr);

        for( ; i<num.length(); i++){
            curr = num.charAt(i)-'0';
            while(!st.isEmpty() && k > 0 && curr < st.peek()){
                st.pop();
                k--;
            }
            st.push(curr);
        }

        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }

        res.reverse();

        int j=0;

        while(j<res.length()-1 && res.charAt(j) == '0'){
            j++;
        }

        return res.substring(j);

    }
}