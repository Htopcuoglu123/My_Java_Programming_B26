package day64_functional_Interface.InterviewProjects;

public class CountJAva {
    public static void main(String[] args) {
        String s="Java is a programming language.Java is cool.Java is Java";

        int count=0;
        for (int i = 0; i <s.length()-3 ; i++) {
            if(s.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}
