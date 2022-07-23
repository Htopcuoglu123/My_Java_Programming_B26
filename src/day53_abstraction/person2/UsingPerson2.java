package day53_abstraction.person2;

public class UsingPerson2 {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Mrs. T",42,"6th and 7th grades","Comp. Science");
        teacher1.action();
        teacher1.leavesHome();
        teacher1.eatsLunch();
        System.out.println(teacher1);
        System.out.println();

        Administration admin1=new Administration("Mr.James",57,"Assistant Principle",85000);
        System.out.println(admin1);
        admin1.leavesHome();
        admin1.eatsLunch();
        admin1.action();
    }
}
