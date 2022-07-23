package day24_loops;

public class CountJava {
    public static void main(String[] args) {

        /*
        java is a language
        0123
        we check every 4 character
        java 0,4  i,1+4
        ava  1,5  1,i+4
        va   2,6
        a    3,7
         */
        String s="java is a java language.java";
        int count=0;

        for(int i=0;i<s.length()-3;i++){//i<=s.length()-4
            String everyFour=s.substring(i,i+4);
            System.out.println(everyFour);
            if(everyFour.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
we did substring(i,i+4) to read every four characters in the string doing i+4 causes the program to go out of boundries
so to fix it we tried i<s.length()-4
but -4 skipped the last four characters in the string
so either you had to do
i<=s.s.length()-4
or i<s.length()-3
 */