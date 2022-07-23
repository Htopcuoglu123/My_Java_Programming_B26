package day49_Inheritance;

public class Employee {
    /*
    Create a Employee class

    - create variables:
        name, is full time, salary

    - create method:
        work()
            Example output: prints $name is working
     */
    String name;
    boolean isFullTime;
    double salary;


    public void work(){
        System.out.println(name+" is working");
    }
}
