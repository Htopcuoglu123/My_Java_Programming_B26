package day32_multiDimensionalArrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [][] cydeo=new String[4][];//four inner arrays that have 3 elements each
        //we can leave the second bracket empty if we want and declare them later
        System.out.println(Arrays.deepToString(cydeo));
        String[]groupOne={"Emre","Yasir","Eda"};
        cydeo[0]=groupOne;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("Adding groupTwo");
        String [] groupTwo={"Basri","Demet","Shina","Ismayil"};//way one of making an array
        cydeo[1]=groupTwo;
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("Adding groupThree");
        cydeo[2]=new String[]{"Mustafa","Lima"};//way two-syntax for making an array without reference
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println("Same group 3 as group 4");
        cydeo[3]=cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));
        for(String[] innerArray:cydeo){//loops through the 2d array, cydeo
            for(String eachWord:innerArray){//loops through every String element in each 1 d array
                System.out.println(eachWord);
            }

        }

    }
}
