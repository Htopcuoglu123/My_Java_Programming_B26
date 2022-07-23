package dailyPractice;

public class sumOfDigitsOfInteger {
    public static int sumOfDigitsOfInteger(int num){
       int sum=0;
       num=Math.abs(num);
       while(num>0){
           sum+=num%10;
           num=num/10;
       }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsOfInteger(145));
    }
}
