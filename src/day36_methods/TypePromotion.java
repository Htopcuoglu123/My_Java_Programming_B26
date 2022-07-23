package day36_methods;

public class TypePromotion {
    public static void main(String[] args) {
        use(3);//even though we do not have an int type method below it will find and promote to the closest one
        // which is long since it holds whole numbers.
        use(3.5);
        use(1.5f);
        use(3L);//forcing manually to use the long type method
        use((double)3);//casting manually to double
        short s=5;
        use(s);//this will search to find the method that has the closest type.Since there
        //is not method with type short it will promote to the closest one which is long
        // since it holds whole numbers
    }
    public static void use(float f){
        System.out.println("calling float method");
    }
    public static void use(double d){
        System.out.println("calling double method");
    }

    public static void use(long l){
        System.out.println("calling long method");
    }
}
