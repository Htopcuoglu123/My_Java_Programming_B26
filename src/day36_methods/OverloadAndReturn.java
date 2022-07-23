package day36_methods;

public class OverloadAndReturn {
    public static void method(){
        System.out.println("default empty method");
    }
    //I will try to overload by changing the return type
   // public static int method(){ This is not valid!Changing the return type does not overload

    //}
    public static int method(int a){//now that I overloaded my method I can change the return if I want
        return 0;
    }
}
