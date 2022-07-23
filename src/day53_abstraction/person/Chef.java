package day53_abstraction.person;

public class Chef extends Employee{
    /*
    Create a class Chef

inherits Employee class

implement hobby() and work() methods

    hobby(): Trying new food

    work(): Cooking a 3-course meal
     */

    public Chef(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Cooking a 3-course meal");
    }

    @Override
    public void hobby() {
        System.out.println("Trying new food");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
