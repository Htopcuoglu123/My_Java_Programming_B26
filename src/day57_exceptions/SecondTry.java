package day57_exceptions;

public class SecondTry {
    public static void main(String[] args) {
        try{
           String s=null;
            //String s="java";
            System.out.println(s.length());//null.length()

            int[]a={1,2,3,4,5};
            System.out.println(a[10]);

        }catch(NullPointerException e){
            System.out.println("Caught a null pointer exception");//It will catch this
            //one and the code will stop and run the part outside the try&catch
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array out of bounce exception");
        }
        System.out.println("Done");
    }

}
