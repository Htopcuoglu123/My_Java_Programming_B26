package day_35.day31_arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence="It started to snow in Chicago";
        String[] wordsOfSentence=sentence.split(" ");

        for (int i =0; i<wordsOfSentence.length; i++) {
            String reverse=" ";
            for (int j = wordsOfSentence[i].length()-1; j>=0; j--) {
                reverse+=wordsOfSentence[i].charAt(j);

            }
            System.out.print(reverse+" ");
            }

        }

        }

