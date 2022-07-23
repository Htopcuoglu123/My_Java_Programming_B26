package day08_relational_operators;

public class AgeGroup {
    public static void main(String[] args) {
        /*
        Task:
        declare and assign an age variable
        is the person a kid(up to 13, including 13)
        is the person a senior citizen(65 and above)
         */
        int person1=13;
        System.out.println("Person 1 is "+ person1+"years old.");
        int person2=63;
        System.out.println("Person 2 is "+person2+"years old.");

        boolean isPerson1AKid=person1<=13;
        boolean isPersonBASenior=person2>=65;
        System.out.println(isPerson1AKid);
        System.out.println(isPersonBASenior);

        //Sample 2

        int age=20;
        boolean isKid=age<=13;
        boolean isSenior=age>=65;

        System.out.println("You are a kid: "+isKid);
        System.out.println("You are a senior citizen: "+isSenior);
    }
}
