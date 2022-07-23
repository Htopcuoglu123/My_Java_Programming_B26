package day64_functional_Interface.InterviewProjects;

public class Factorial {
    /*
    /goal is to;5*4*3*2*1
        //repeated action;multiply the numbers
        //stopping point:number gets to 1

     */
    public static void main(String[] args) {
        int num=5;
        int result=1;
        while(num>1){
            System.out.println(result+"*"+num);
            result*=num;
            num--;


        }
        System.out.println(result);
    }

}
