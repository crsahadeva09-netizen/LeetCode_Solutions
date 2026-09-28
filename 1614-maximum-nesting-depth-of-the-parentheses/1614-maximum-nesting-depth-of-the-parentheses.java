class Solution {
    public int maxDepth(String s) {
        int num = 0;
        int res = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                num++;
                res = Math.max(res, num);
            }else if(s.charAt(i) == ')'){
                num--;
            }
        }

        return res;
    }
}