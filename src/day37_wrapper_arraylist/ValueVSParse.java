package day37_wrapper_arraylist;

public class ValueVSParse {
    public static void main(String[] args) {
        String s="30";
        int seconds=Integer.parseInt(s);//converting 30 String into an int of 30 primitive type

        Integer.valueOf(s);//it converts 30 String into Integer wrapper class object

       // int i2=Integer.valueOf(s);//although this works we do not prefer to use this.We prefer using the parse method
        /*
        Integer.valueOf(s);-->converts the "30" String into the Integer Object
        int i2=--> I am trying to store the value into a primitive variable
        primitive=object type[unboxing]
         */

        String s2=String.valueOf(30);//converts 30 into a String
        System.out.println(s2+5);
    }
}
