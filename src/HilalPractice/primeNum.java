package HilalPractice;

public class primeNum {
    public static void main(String[] args) {
        int num = 50;
        for (int i = 2; i <num ; i++) {
            boolean isPrime=true;
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                   isPrime=false;
                }

            }
            if(isPrime){
                System.out.print(i+" ");
            }
        }


    }
}
