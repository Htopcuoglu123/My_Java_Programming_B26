package day64_functional_Interface.InterviewProjects;

import org.w3c.dom.ls.LSOutput;

public class SumOfDigitsInString {
    //4. String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string
    public static void main(String[] args) {
        String s="jav45ai1000sgre1at82";
        System.out.println(sumOfDigits1(s));
       // System.out.println(sumOfDigits(s));
    }


    public static int sumOfDigits1(String s) {

        String digits="0";
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i))){
                digits+=s.charAt(i);

            }else{
                sum+=Integer.parseInt(digits);
                digits="0";//we put a 0 because if we do not have any number in String it will give us NumberFormatExeption
                //since 0 has no effect to result we used it to prevent errors
            }


        }
        return sum+Integer.parseInt(digits);//if we do not add Integer.parseInt part it will not add the last two digits
    }



//    public static int sumOfDigits(String str){
//
//        String digits="";
//        int sum=0;
//        for (int i = 0; i < str.length() ; i++) {
//            if(Character.isDigit(str.charAt(i))){
//                digits+=str.charAt(i);
//            }
//        }
//        for (int i = 0; i <digits.length() ; i++) {
//            sum+=Character.getNumericValue(digits.charAt(i));
//        }
//        return sum;
//    }
//
}
