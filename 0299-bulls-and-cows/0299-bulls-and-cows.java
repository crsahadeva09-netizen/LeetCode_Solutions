class Solution {
    public String getHint(String secret, String guess) {

        int cows = 0, bulls = 0;
        int[] arr = new int[10];

        for(int i=0; i<secret.length(); i++){
            char sch = secret.charAt(i);
            char cch = guess.charAt(i);

            if(sch == cch){
                bulls++;
                continue;
            }

            if(arr[sch-'0'] < 0){
                cows++;
            }

            if(arr[cch - '0'] > 0){
                cows++;
            }

            arr[sch - '0']++;
            arr[cch - '0']--;
        }

        StringBuilder str = new StringBuilder();
        str.append(bulls).append("A").append(cows).append("B");

        return str.toString();
        
    }
}