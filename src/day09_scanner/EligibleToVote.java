package day09_scanner;

public class EligibleToVote {
    /*
    Task:
    Create and assign these variables;
    name
    Are they citizen?
    Do they have criminal background?
    age

    Determine if they are eligible to vote
    They can only vote if they are a citizen, have no criminal background and are about age 18 or older
     */
    public static void main(String[] args) {
        String name = "Jack";
        boolean isCitizen = true;
        boolean hasCriminalBackground = true;
        int age=19;
        boolean isEligibleToVote= isCitizen&& age>=18 && !hasCriminalBackground;
        System.out.println("Is "+name +" eligible to vote:"+ isEligibleToVote);

    }
}
