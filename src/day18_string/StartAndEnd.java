package day18_string;

public class StartAndEnd {
    public static void main(String[] args) {
        String str="Apples";
        System.out.println(str.startsWith("App"));
        System.out.println(str.startsWith("app"));

        String s="App";
        System.out.println(str.startsWith(s));//Does my String str start with my variable s which has the value "App"?
        // The variable str has the value of Apple starts with the variable s which has the value of App.

        String sentence="today was a good day";
        System.out.println(sentence.startsWith("today was a"));


        System.out.println(sentence.endsWith("day"));//true
        System.out.println(sentence.endsWith(" day"));//true
        System.out.println(sentence.endsWith("good"));//false
        System.out.println(sentence.endsWith("today was a good day"));
    }
}
