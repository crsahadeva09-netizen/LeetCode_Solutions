class Solution {
    public void permute(int n, List<String> ans, int open, int close, StringBuilder sb){
        if(sb.length() == 2*n){
            ans.add(sb.toString());
            return;
        }

        if(open<n){
            sb.append('(');
            permute(n, ans, open + 1, close, sb);
            sb.deleteCharAt(sb.length()-1);
        }

        if(close<open){
            sb.append(')');
            permute(n, ans, open, close + 1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");

        permute(n, ans, 0, 0, sb);

        return ans;
    }
}