package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {
        int i= 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
            i++;

        }
        System.out.println("\n_____________________________________________________________");

        int n=2;
        while(n<=100){
            System.out.print(n+" ");
            n+=2;
        }
        System.out.println("\n__________________________________________________________________");

        int t=1;
        while(t<=100){
            System.out.print(t+" ");
            t+=2;
        }

        System.out.println("\n______________________________________________________________________");
         int k=0;
         while(k++<=100){
            if(k%2==0){
                System.out.print(k+" ");
            }
        }



    }
}
