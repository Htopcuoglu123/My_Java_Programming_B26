package day64_functional_Interface.InterviewProjects;

public class sumOfDigits {
    public static void main(String[] args) {
        String s="123";
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {

            sum+=Character.getNumericValue(s.charAt(i));
        }
        System.out.println(sum);
    }
}
