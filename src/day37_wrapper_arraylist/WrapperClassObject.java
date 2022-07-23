package day37_wrapper_arraylist;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a=5;//this is a primitive type. What can we do with this?:assign/reassign/math/casting
        //What can't we do with this?:a.method()

        Integer a2=new Integer(10);//we can use this but not preferred
        Integer a3=20;//preferred way of autoboxing
        int a4=a3;//unboxing -object to primitive type

        System.out.println(a);
        System.out.println(a2);
        System.out.println(a3);

        byte b=2;
        Byte b2=20;
    }
}
