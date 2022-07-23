package March29th;

public class SumOfDigits {
    public static int sumOfDigits(String word){
        int sum=0;
        int z=0;

        for(int i=0;i<word.length();i++){
            z=Character.getNumericValue(word.charAt(i));
            if(z>=1&&z<=9){
                sum+=z;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("ht43tt45at19yt15"));
    }
}
