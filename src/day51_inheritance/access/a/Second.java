package day51_inheritance.access.a;

public class Second {
    //this is a different class in the same package
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
       // System.out.println(obj.four);this one is not accessible because it is private
    }
}
