package day11_if_statements.day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        //this is a valid do while loop where the number will run up to 10
        int a=0;
        do{
            //everything between the curly bracket are in the loop
            System.out.println(a);
            a++;
        }while(a<10);
        //this has a boolean of false but since this is a do while loop it will run once

        System.out.println("With false boolean");

        int a2=0;
        do{
            //everything between the curly bracket are in the loop
            System.out.println(a2);
            a2++;
        }while(a2==10);

        //this is a while loop version of the previous code. This will not print anything since the boolean is false

        System.out.println("as while loop");
        int a3=0;
        while(a3==10){
            System.out.println(a3);
            a3++;
        }
    }
}
