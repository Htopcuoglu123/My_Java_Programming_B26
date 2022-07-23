package day34_methods.day19;

public class MergeStrings {
    public static void main(String[] args) {
        /*
        two Strings:hardcode to have 3 characters
        merge the strings together
         */
        String a="fun";
        String b="day";
        String merged="";
        System.out.println(""+a.charAt(0)+b.charAt(0)+a.charAt(1)+b.charAt(1)+a.charAt(2)+b.charAt(2));
        merged+=a.charAt(0);
        merged+=b.charAt(0);
        merged+=a.charAt(1);
        merged+=b.charAt(1);
        merged+=a.charAt(2);
        merged+=b.charAt(2);
        System.out.println("Second version:"+merged);


    }
}
