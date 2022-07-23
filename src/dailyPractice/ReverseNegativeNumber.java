package dailyPractice;

public class ReverseNegativeNumber {
public static int reverse(int num){
    String s=Integer.toString(Math.abs(num));
    String reverse="";
    for (int i =s.length()-1; i>=0 ; i--) {
        reverse+=s.charAt(i);
    }
    if(num<0){
        num=Integer.parseInt(reverse)*-1;
    }else{
        num=Integer.parseInt(reverse);
    }
    return num;
}

    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse(432));
    }
    }
