class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder ans = new StringBuilder();
        int i=num1.length()-1;
        int j = num2.length()-1;
        int car = 0;

        while(i>=0 && j>=0){
            int k = num1.charAt(i)-'0' + num2.charAt(j)-'0'+car;
            i--;
            j--;
            car = k/10;
            k = k%10;

            ans.append(k+"");
        }

        while(i>=0){
            int k = num1.charAt(i)-'0' + car;
            car = k/10;
            k = k%10;

            ans.append(k+"");
            i--;
        }

        while(j>=0){
            int k = num2.charAt(j)-'0' + car;
            car = k/10;
            k = k%10;
            ans.append(k+"");
            j--;
        }
        if(car!=0)
            ans.append(car+"");

        return ans.reverse().toString();
        
    }
}