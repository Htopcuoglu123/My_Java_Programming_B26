package day28_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //1st way=with normal variables
        String cityOne="Chicago";
        String cityTwo="New York";
        String cityThree="Houston";
        String cityFour="Denver";
        String cityFive="Pittsburgh";

        //declare array with values

        String[]cities={"Chicago","New York","Houston","Denver","Pittsburgh"};





       // System.out.println(cities);//this doesn't print the array how we want

        //How to access each element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        //all in one line

        System.out.println("Reverse order of cities "+cities[4]+","+cities[3]+","+cities[2]+","+cities[1]+","+cities[0]);

        //print array all at one time
        // System.out.println(cities);//this doesn't print the array how we want
        System.out.println(Arrays.toString(cities));//this method from Arrays class lets you print the array fully

        //number of elements
        System.out.println("The length of the array of cities is:"+cities.length);

    }
}
