package day23_loops.day26_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe\n");

        for(int i=0;i<5;i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Universe");
        System.out.println("______________________________________________________________________________");

        for(int j=0;j<3;j++){//outer loop
            for(int i=0;i<5;i++){//inner loop
                System.out.println("Hello World");
            }
            System.out.println("Hello Universe");
        }




    }
}
