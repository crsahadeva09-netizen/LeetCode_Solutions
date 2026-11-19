class Solution {
    public int dayOfYear(String date) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int year = Integer.parseInt(date.substring(0,4));
        if(year%400 == 0 || (year%4==0 && year%100 != 0)){
            days[1] = 29;
        }

        int month = Integer.parseInt(date.substring(5,7));
        int total = 0;

        for(int i=1; i<month; i++){
            total += days[i-1];
        }

        int day = Integer.parseInt(date.substring(8,10));

        total += day;

        return total;
        
    }
}