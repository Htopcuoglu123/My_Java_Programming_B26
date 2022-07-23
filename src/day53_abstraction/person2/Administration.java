package day53_abstraction.person2;

public class Administration extends Person2{
    String jobTitle;
    double salary;

    public Administration(String name, int age, String jobTitle, double salary){
        super(name,age);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void leavesHome() {
        System.out.println("The "+jobTitle+" "+name+" leaves home at 6:30am");
    }

    @Override
    public void eatsLunch() {
        System.out.println("The "+jobTitle+" "+"eats lunch when he can find time in between meetings.");

    }

    @Override
    public void action() {
        System.out.println("Having meetings all day long!");

    }

    @Override
    public String toString() {
        return "Administration{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
