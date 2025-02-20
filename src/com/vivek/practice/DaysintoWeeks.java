package com.vivek.practice;

public class DaysintoWeeks {
//    Emma’s boss wants the number of days converted into a weeks and days format instead of just a total number of days. The output format should be carefully followed:
//            •	If there are both weeks and days, use "weeks + days".
//            •	If there is exactly one week or one day, use "week" or "day" (singular).
//            •	If there are only weeks or only days, print that part only.
//	•	If there are 0 days, print "0 days".
    public static void main(String[] args) {
        int totaldays = 15;
        int weeks = totaldays/7;
        int days = totaldays%7;
        StringBuilder result = new StringBuilder();
        
        if(weeks>0)
        {
            if(weeks==1)
                result.append(weeks).append("week");
            else 
                result.append(weeks).append("weeks");
        }
        if(days>0)
        {
            //case where total no. of days >7
            if(result.length()>0) {
                result.append("+");
            }

            if(days==1)
                result.append(days).append("day");
            else
                    result.append(days).append("days");

                
        }
        if (result.length()==0)
            result.append("0 days");

        System.out.println(result);
    }
}
