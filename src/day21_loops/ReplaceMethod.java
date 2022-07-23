package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {
        String s="java is a language";
        s=s.replace('a','e');
        System.out.println(s);
        String day="Today is Monday";
        day=day.replace("Monday","Tuesday");
        System.out.println(day);
        String str="Today is Monday.We will Monday.Its Monday";
        System.out.println(str.replaceFirst("Monday","Tuesday"));

        String target="Today is Monday.We will Monday.Its Monday";
        int firstIndex=target.indexOf('.');
        int secondIndex=target.lastIndexOf('.');
        String myMiddleStr=target.substring(firstIndex,secondIndex);
        myMiddleStr=myMiddleStr.replace("Monday","weekday");
        System.out.println(target.substring(0,firstIndex)+myMiddleStr+target.substring(secondIndex));
    }
}
