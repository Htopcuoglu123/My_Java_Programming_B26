package march22nd;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input="  Hello world        I     love       Java    ";
        removeSpaces(input);
    }
/*
write a method that can remove all the spaces from the string
 */

    public static void removeSpaces(String str){
        String []s=str.trim().split(" ");
        System.out.println(Arrays.toString(s));
        //System.out.println(s[2].length()); to see we have empty string
        for (String each:s) {
            if(!each.isEmpty()){
                System.out.print(each+" ");
            }


        }


    }



    }




