package day24_loops;

public class BiggestSubstring2 {
    public static void main(String[] args) {
        String s="aaaaaaaabbbcccccdddddddee";
        String sub="";
        String biggest="";
        for(int i=0;i<s.length()-1;i++){

            sub+=s.charAt(i);
            if(s.charAt(i)!=s.charAt(i+1)){//when the character of i is different from the one next to it(i+1)
                if(sub.length()>biggest.length()){
                    biggest=sub;//assigns the substring as the biggest
                }
                sub="";//resets this string for the next substring
            }
        }
        System.out.println(biggest);
    }
}
