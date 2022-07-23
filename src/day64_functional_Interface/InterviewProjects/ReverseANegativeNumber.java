package day64_functional_Interface.InterviewProjects;

public class ReverseANegativeNumber {
   public static int reversedNum(int num){
       String str=Integer.toString(Math.abs(num));
       String reversed="";
       for (int i =str.length()-1;i>=0 ; i--) {
           reversed+=str.charAt(i);
       }
       if(num<0){
           num=Integer.parseInt(reversed)*-1;
       }else{
           num=Integer.parseInt(reversed);
       }
       return num;
   }

    public static void main(String[] args) {
        System.out.println(reversedNum(-1234));
        System.out.println(reversedNum(8906));
    }
}
