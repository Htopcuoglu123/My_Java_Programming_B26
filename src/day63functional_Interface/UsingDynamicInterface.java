package day63functional_Interface;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        DynamicInterface <String>printEachChar=(str)->{
            for (int i = 0; i <str.length() ; i++) {
                System.out.println(str.charAt(i));
            }
        };

        printEachChar.test("Hello World");//printEachChar.test because we named
        // our method as test in DynamicInterface

        DynamicInterface<Integer>printNum5Times=n->{
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
            System.out.println(n);
        };
        printNum5Times.test(5);

        DynamicInterface <Integer>multiplyBy5=(n)->{
            System.out.println(n*5);
        };

        multiplyBy5.test(8);
    }
}
