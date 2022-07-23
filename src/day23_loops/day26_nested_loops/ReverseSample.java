package day23_loops.day26_nested_loops;

public class ReverseSample {
    public static void main(String[] args) {
        String s="Hilal";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        System.out.println(reverse);
    }
}
