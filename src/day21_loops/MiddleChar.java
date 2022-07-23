package day21_loops;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s="tarkan";
        int mid=s.length()/2;
        if(s.length()%2==0){
            char firstMiddle=s.charAt(mid-1);
            char secondMiddle=s.charAt(mid);
            System.out.println("With charAt: "+firstMiddle+secondMiddle);
            System.out.println("With substring:"+s.substring(mid-1,mid+1));

        }else{
            char middle=s.charAt(mid);
            System.out.println("With charAt:"+middle);
            System.out.println("With substring: "+s.substring(mid,mid+1));

        }
    }
}
