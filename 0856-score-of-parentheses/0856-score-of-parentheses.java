class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st = new Stack<>();
        int x = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(x);
                x = 0;
            } 
            else {
                int prev = st.pop();

                if (x == 0) {
                    x = 1;
                } 
                else {
                    x = 2 * x;
                }

                x += prev;
            }
        }

        return x;
    }
}