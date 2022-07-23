package day64_functional_Interface.InterviewProjects;

import java.io.FilterOutputStream;

/*
3) Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are
a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5,
 print "RA" instead of the number. for numbers which are a multiple of both 3 and 5,
  print "FINRA" instead of the number.

 */
public class FinRa {
    public static String FinRa(int num){
        String result="";
        for (int i = 1; i <=num ; i++) {

            if(i%3==0&&i%5==0){
                result+="FinRa"+"-";
            }
            else if(i%3==0){
               result+="Fin"+"-";
            }
            else if(i%5==0){
                result+= "Ra"+"-";
            }else{
                result+=i+"-";
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FinRa(30));
    }
}
