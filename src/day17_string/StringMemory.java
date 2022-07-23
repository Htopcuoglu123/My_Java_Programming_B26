package day17_string;

public class StringMemory {
    public static void main(String[] args) {
        String first="java";//String literal, directly in the string pool
        String second=new String("java");//String object, not in string pool but directly in the heap/

        System.out.println(first==second);
        //==with String types gives you false. The == doesnt compare the characters it compares the memory location of the object
        String third="java";
        System.out.println(first==third);//this is true because it is comparing the objects and they are the same objects.
        // These two variables pointing at the same object.
        // There is only one object in the String pool.

        String forth="Java";//at this line, how many objects in the String pool?:2 Java and java

        System.out.println(first==forth);
        // at this point how many total objects is there. 3in total 2 in the string pool and 1 in the heap

        String fifth=new String("java");
        System.out.println(second==fifth);

    }
}
