package day18_string;

public class Contains {
    public static void main(String[] args) {
        String day="Today it is above 70";
        System.out.println(day.contains("it is"));
        System.out.println(day.contains("itis"));
        System.out.println(day.contains("ay it"));
        System.out.println(day.contains("today is"));//false because today is lowercase but day variable starts with a capital T.
        System.out.println(day.contains("Ti7"));//false because the sequence is not the same, sequence needs to be exactly the same
        System.out.println(day.contains("T")&&day.contains("i")&&day.contains("7"));//true
    }
}
