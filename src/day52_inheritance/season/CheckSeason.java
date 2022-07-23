package day52_inheritance.season;

public class CheckSeason {
    /*
    Create a class CheckSeason

	create an object of Winter, Summer, Fall and Spring and verify if constructor, toString(), and activity() are working properly for each class

	List the is a relations of all the classes

     */
    public static void main(String[] args) {
        Fall obj1=new Fall(55,35);
        System.out.println(obj1);
        System.out.println(obj1.activity());
        System.out.println("____________________________________________--");
        Spring obj2=new Spring(75,35);
        System.out.println(obj2);
        System.out.println(obj2.activity());
        System.out.println("______________________________________________");
        Winter obj3=new Winter(38,-12);
        System.out.println(obj3);
        System.out.println(obj3.activity());
        System.out.println("_______________________________________________");
        Summer obj4=new Summer(108,50);
        System.out.println(obj4);
        System.out.println(obj4.activity());
    }
}
