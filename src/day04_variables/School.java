package day04_variables;

public class School {
    public static void main(String[] args) {
        int numGrade1=43;
        int numGrade2=48;
        int numGrade3=50;
        int numGrade4=48;
        int numGrade5=51;
        int totalNum=numGrade1+numGrade2+numGrade3+numGrade4+numGrade5;
        System.out.println(totalNum);
        double daysInYear=182.5;
        double snowDays=2.5;
        double averageGPA=3.5;

        System.out.println("We have "+numGrade1 +" students in Grade 1.");
        System.out.println("We have "+numGrade2 +" students in Grade 2.");
        System.out.println("We have "+numGrade3 +" students in Grade 3.");
        System.out.println("We have "+numGrade4 +" students in Grade 4.");
        System.out.println("We have "+numGrade5 +" students in Grade 5.");
        System.out.println("We have "+totalNum + " students in school");
        System.out.println("Our students' average GPA is "+ averageGPA);
        System.out.println("We have "+daysInYear+" schools days in a year");
        System.out.println("We had "+ snowDays+ " snow days this  year.");
        System.out.println("averageGPA = " + averageGPA);



    }
}
