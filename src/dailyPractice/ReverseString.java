package dailyPractice;

public class ReverseString {
public static String reverse(String s){
    String reverse="";
    for (int i =s.length()-1; i>=0; i--) {
        reverse+=s.charAt(i);
    }
    return reverse;
}

    public static void main(String[] args) {
        System.out.println(reverse("Topcuoglu"));
    }
}
