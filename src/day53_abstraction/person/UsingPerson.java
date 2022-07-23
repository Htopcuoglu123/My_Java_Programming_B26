package day53_abstraction.person;

public class UsingPerson {
    public static void main(String[] args) {
       Chef person1=new Chef("James",45,"Main Chef",120000);
       System.out.println(person1);
       person1.hobby();
       person1.work();
       System.out.println();
       Tester person2=new Tester("Hilal",42,"QA",120000);
       System.out.println(person2);
       person2.hobby();
       person2.work();
    }
}
