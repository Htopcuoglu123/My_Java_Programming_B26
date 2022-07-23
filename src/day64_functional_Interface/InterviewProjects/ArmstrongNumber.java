package day64_functional_Interface.InterviewProjects;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        int result=0;
       int originalNum=num;
        while(num!=0){
            int remainder=num%10;
            result+=remainder*remainder*remainder;
            num=num/10;
        }
        if(originalNum==result){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
