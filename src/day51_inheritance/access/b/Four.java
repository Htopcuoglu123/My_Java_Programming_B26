package day51_inheritance.access.b;

import day51_inheritance.access.a.First;

public class Four extends First {
    //different class, different package with inheritance
    public static void main(String[] args) {
        First obj=new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
        Four obj2=new Four();
        System.out.println(obj2.one);//public
        System.out.println(obj2.two);//protected
    }
    /*
   => line 10 is trying to directly access a protected variable outside the package
    you cannot directly access any protected information outside the package
    =>line 25 we are able to access the two variable because it is inherited
     from the first  class to the Four class, so the two variable belongs to
     the objects of the Four class(subclass)
     */
}
