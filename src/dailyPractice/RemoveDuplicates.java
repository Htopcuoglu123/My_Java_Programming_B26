package dailyPractice;

public class RemoveDuplicates {
public static String removed(String s){
    String removed="";
    for (int i = 0; i <s.length() ; i++) {
        if(!removed.contains(s.charAt(i)+"")){
            removed+=s.charAt(i);
        }
    }
    return removed;
}

    public static void main(String[] args) {
        System.out.println(removed("aassdsffrmkkl"));

    }
}

