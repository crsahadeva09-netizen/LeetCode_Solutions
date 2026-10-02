class Solution {
    public boolean canBeValid(String s, String locked) {

        if(s.length()%2!=0){
            return false;
        }

        int res = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || locked.charAt(i)=='0'){
                res++;
            }else{
                res--;
            }

            if(res<0)
                return false;
        }

        res = 0;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ')' || locked.charAt(i)=='0'){
                res++;
            }else{
                res--;
            }

            if(res<0)
                return false;
        }
        
        return true;
        
    }
}