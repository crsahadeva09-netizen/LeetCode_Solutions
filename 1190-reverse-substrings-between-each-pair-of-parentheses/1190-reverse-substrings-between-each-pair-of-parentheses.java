class Solution {
    public String reverseParentheses(String s) {

        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==')'){
                StringBuilder a = new StringBuilder();

                while(st.peek() != '('){
                    a.append(st.pop());
                }

                st.pop();

                for(int l=0; l<a.length(); l++){
                    st.push(a.charAt(l));
                }
            }else{
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.reverse().toString();
        
    }
}