package day37_wrapper_arraylist;

public class GoogleSearch {
    public static void main(String[] args) {
        String result="About 2,550,000,000 results (1.00 seconds)";
        String [] arr=result.split(" ");
        String resultStr=arr[1].replace(",","");
        String timeStr=arr[3].substring(1);
        System.out.println(resultStr);
        System.out.println(timeStr);
        //System.out.println(Integer.MAX_VALUE);//checked the maximum value of int,
        // it doesn't, so we used wrapper class to convert String to long and double
        long resultNumber=Long.parseLong(resultStr);
        double timeNumber=Double.parseDouble(timeStr);
        if(resultNumber>=0) {
            System.out.println("Test case passed-Positive Number");
        }
        if(timeNumber<2&&timeNumber>=0){
            System.out.println("Test case passed-Under 2 seconds");
        }
        }
    }

