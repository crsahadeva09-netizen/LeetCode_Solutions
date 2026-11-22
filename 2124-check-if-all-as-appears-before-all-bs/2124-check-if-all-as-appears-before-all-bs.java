class Solution {
    public boolean checkString(String s) {

        boolean b_presence = false;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b')
                b_presence = true;
            if(b_presence & s.charAt(i) == 'a'){
                return false;
            }
        }
        
        return true;
    }
}