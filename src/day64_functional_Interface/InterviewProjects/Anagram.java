package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
       if(a.length()==b.length()){
           for (int i = 0; i <a.length() ; i++) {
               char letter=a.charAt(i);
               b=b.replaceFirst(letter+"","");
               if(b.isEmpty()){
                   System.out.println("Anagram");
               }else{
                   System.out.println("Not anagram");
               }
           }
           } else{
           System.out.println("Not anagram");
       }
       String c="hilal";
       String d="halil";
       char[]c1=c.toCharArray();
       Arrays.sort(c1);

       char[]d1=d.toCharArray();
       Arrays.sort(d1);
       if(Arrays.equals(c1,d1)){
           System.out.println("Anagram");
        }else{
           System.out.println("Not anagram");
       }

    }
}
