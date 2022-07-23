package day53_abstraction.person2;

public class Teacher extends Person2 {
    String jobTitle;
    String gradesToTeach;
    String subject;


    public Teacher(String name, int age, String gradesToTeach, String subject) {
        super(name, age);
        this.gradesToTeach = gradesToTeach;
        this.subject = subject;
    }

    @Override
    public void leavesHome() {
        System.out.println("Leaves home at 6:40am");
    }

    @Override
    public void eatsLunch() {
        System.out.println("Eats lunch during his/her free block");
    }

    @Override
    public void action() {
        System.out.println("Teaches and grades classwork,tests and quizez");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "gradesToTeach='" + gradesToTeach + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}



