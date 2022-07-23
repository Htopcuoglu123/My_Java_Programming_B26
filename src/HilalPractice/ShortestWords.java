package HilalPractice;

import java.util.Arrays;

public class ShortestWords {
    public static void main(String[] args) {
        String sent="love cats my cat is so cute";
        String[]words=sent.split(" ");
        String shortest=words[0];
        String sameSize="";
        for(int i=0;i<words.length-1;i++){
                if(words[i].length()<shortest.length()){
                    shortest=words[i];
                }
            }
        for (String each:words){
            if(each.length()==shortest.length()){
                sameSize+=each+" ";
            }
        }
        String[]shortWords=sameSize.split(" ");
        System.out.println(Arrays.toString(shortWords));
        }

    }

