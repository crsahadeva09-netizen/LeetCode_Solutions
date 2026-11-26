class Solution {
    public boolean canAliceWin(int n) {

        char turn = 'a';
        int a = 10;

        while(n>0){
            if(n-a>=0){
                n = n-a;
                if(turn == 'a')
                    turn = 'b';
                else
                    turn = 'a';
                a--;
            }else
                break;
        }

        if(turn=='a')
            return false;
        else
            return true;
        
    }
}