package day53_abstraction.person2;

public class Student extends Person2{
    String gradeLevel;
    public Student(String name,int age,String gradeLevel){
        super(name,age);
        this.gradeLevel=gradeLevel;
    }

    @Override
    public void leavesHome() {
        System.out.println("Leaves home at 7:10am");

    }

    @Override
    public void eatsLunch() {
        System.out.println("Eats lunch during the school lunchtime");
    }

    @Override
    public void action() {

        System.out.println("Attends classes, completes classworks and homeworks");

    }
}
