package day49_Inheritance;

public class Developer extends Employee {
    /*

Create a class Developer

    - Developer class inherits Employee class

    - create additional variables:
        features created

    - create method:
        develop()
            Example output: prints Creating more features

Create objects of all three to see which variables and methods each object has access to

     */
    boolean featuresCreated;

    public void develop(){
        System.out.println("Creating more features");
    }
}
