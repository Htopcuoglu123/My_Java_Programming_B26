package day34_methods.day19;

public class SubStringMethod {
    public static void main(String[] args) {
        String str="Sunday";
        //          012345

        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("Satur"+str.substring(3));
        System.out.println(str.substring(2,4));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,6));//ok because the index 6 is just the stopping point
        System.out.println(str.substring(0,7));//this will not work because 6 is read and index 7 does not exist in my string
    }
}
