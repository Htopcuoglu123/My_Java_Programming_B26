package day24_loops;

public class Syllables {
    public static void main(String[] args) {
        String word="ja-va-li-na";
        int numSYllables=0;//int numSyllable=1;since if we have a wor it is at least one syllable
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='-'){
                numSYllables++;
            }
        }
        System.out.println(numSYllables+1);//System.out.println(numSyllable)since we started as
        // numSyllable=1 already we do not need to do +1

    }
}
