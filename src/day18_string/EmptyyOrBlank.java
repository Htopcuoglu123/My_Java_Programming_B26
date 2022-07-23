package day18_string;

public class EmptyyOrBlank {
    public static void main(String[] args) {
        String str="last example";
        System.out.println(str.isEmpty());

        str="";
        System.out.println("s is empty:"+str.isEmpty());

        String s="  ";
        System.out.println(s.isEmpty());//false since there is space in there and space is counted as character
        System.out.println("is blank:"+s.isBlank());
    }
}
