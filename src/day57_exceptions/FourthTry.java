package day57_exceptions;

public class FourthTry {
    public static void main(String[] args) {


        try {
            System.out.println("Start");
            Thread.sleep(-2000);
            System.out.println("Finish");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
