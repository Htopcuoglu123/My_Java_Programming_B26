package day23_loops;

public class CountLetter2 {
    public static void main(String[] args) {
        String str="Banana";
        int count=0;
        char letter='n';
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            if(str.charAt(i)==letter){
               count++;
            }
        }
        System.out.println("There are "+count+" "+letter+"'s");
    }
}
