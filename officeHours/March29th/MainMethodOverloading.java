package March29th;

public class MainMethodOverloading {
    public static void main(char[] args) {
        //can we overload mainMethod?
        //yes we can but java search for the String one.If we do not have
        // the main method with String we will not be able to
        //run out code


        System.out.println("Hello from char main");
    }

    public static void main(String[] args) {
        System.out.println("Hello from String main");
    }

    public static void main(int [] args) {
        System.out.println("Hello from int main");
    }
}
