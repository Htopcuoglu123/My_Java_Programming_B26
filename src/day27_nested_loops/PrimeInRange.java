package day27_nested_loops;

public class PrimeInRange {
    public static void main(String[] args) {
       String prime="";
        for (int i = 2; i <=50 ; i++) {
            int count=0;
            for (int j = i; j>=1; j--) {
                if (i % j == 0) {
                    count++;

                }
            }
                if(count==2){
                    prime+=i+" ";
                }

        }
            System.out.print(prime);
        }

    }



