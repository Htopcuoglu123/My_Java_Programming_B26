package dailyPractice;

public class FindUnique {
/*
4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
 */
public static String unique(String word){

    String uniqueOne="";
    for (int i = 0; i < word.length(); i++) {
        int count=0;
        for (int j = 0; j < word.length(); j++) {
            if(word.charAt(i)==word.charAt(j)){
                count++;
            }
        }
        if(count==1){
            uniqueOne+=word.charAt(i);
        }

}

   return uniqueOne;
}

    public static void main(String[] args) {
        System.out.println(unique("hilal"));
    }
}