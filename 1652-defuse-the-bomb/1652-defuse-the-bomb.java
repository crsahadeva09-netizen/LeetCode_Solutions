class Solution {
    public int[] decrypt(int[] code, int k) {

        int n = code.length;

        int[] res = new int[n];

        for(int i=0; i<n; i++){
            if(k>0){
                int s = i+1;
                int cnt = 0;
                while(cnt<k){
                    if(s==n){
                        s = 0;
                    }
                    res[i] += code[s];
                    s++;
                    cnt++;
                }
            }
            if(k<0){
                int s = i-1;
                int cnt = 0;
                while(cnt<-k){
                    if(s==-1){
                        s = n-1;
                    }
                    res[i] += code[s];
                    s--;
                    cnt++;
                }
            }
            if(k==0){
                res[i] = 0;
            }
        }

        return res;
        
    }
}