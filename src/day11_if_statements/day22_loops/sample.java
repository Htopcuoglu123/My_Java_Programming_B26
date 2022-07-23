package day11_if_statements.day22_loops;

public class sample {
    public static void main(String[] args) {
        boolean male = true;

        int age = 10;

        if (male)
            if (age < 20)
                System.out.println("Boy");

            else
                System.out.println("Man");


        else

            if (age < 20)
                System.out.println("Girl");
            else
                System.out.println("Woman");

        }

    }

