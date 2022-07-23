package day23_loops.day26_nested_loops;

public class StringSample1 {
    public static void main(String[] args) {
        String s="Cydeo School";

       for (int i = 0; i <s.length() ; i++) {
           if(s.charAt(i)==' '){
              break;//this will stop the code at ' '
               //if we use continue instead of break it will skip ' ' and continue with the next letter
           }
           System.out.println(s.charAt(i));
        }
    }
}
