package day64_functional_Interface.InterviewProjects;

public class PrimeNum {
    public static String isPrime(int num){
        String s="";
        int count=0;
        for (int i = 2; i <=num ; i++) {
            if(num%i==0){
                count++;
            }
        }
        if(count==1){
            s+=num+" is Prime number";
        }else{
            s+=num+"is not prime number";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
