package day49_Inheritance;

public class Company {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.name="Hilal";
        tester1.isFullTime=true;
        tester1.salary=120000;
        tester1.work();
        tester1.bugsFound=true;
        tester1.test();

        System.out.println();

        Developer dev1=new Developer();
        dev1.name="Michaela";
        dev1.salary=120000;
        dev1.isFullTime=true;
        dev1.featuresCreated=true;
        dev1.work();
        dev1.develop();


    }

}
