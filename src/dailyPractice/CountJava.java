package dailyPractice;

public class CountJava {
public static int countJava(String word){
    int count=0;
    for (int i = 0; i <word.length()-3 ; i++) {
        if(word.substring(i,i+4).equalsIgnoreCase("java")){
            count++;
        }
    }
    return count;
}

    public static void main(String[] args) {
        System.out.println(countJava("javaLove!JavagoodJavaLove Java Java"));
    }
}
