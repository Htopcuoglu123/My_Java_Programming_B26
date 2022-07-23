package day53_abstraction.person;

public class Tester extends Employee {
    /*
    Create a class Tester

inherits Employee class

implement hobby() and work() methods

    hobby(): create a print statement for your own hobbies

    work(): Running test cases

     */

    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    @Override
    public void hobby() {
        System.out.println("My favorite hobby is gardening");
    }

}
