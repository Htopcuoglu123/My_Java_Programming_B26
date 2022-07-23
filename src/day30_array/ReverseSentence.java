package day30_array;

public class ReverseSentence {
    public static void main(String[] args) {
        String s="Today is Monday";
        String[] words=s.split(" ");
        String reverse="";
       for(int i=words.length-1;i>=0;i--){
           reverse+=words[i]+" ";

       }
        System.out.println(reverse.trim());
    }
}
