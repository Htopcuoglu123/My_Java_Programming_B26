package day23_loops;

public class CountLetter {
    public static void main(String[] args) {
        /*
        Given a String we want to count how many "l" characters we have

                 */
        String s="hilal";
        int count=0;
        for(int i=0;i<s.length();i++){

          if(s.charAt(i)=='l'){
              count++;

          }

       }
        System.out.println(count);
    }
}
