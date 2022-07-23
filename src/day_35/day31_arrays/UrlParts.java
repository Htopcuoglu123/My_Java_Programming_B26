package day_35.day31_arrays;

import java.util.Arrays;

public class UrlParts {
    public static void main(String[] args) {
        String url="http://learn.cydeo.com/courses/130";
       String[]urlParts=url.split("/");
       for(String each:urlParts){
           System.out.println(each);
        }
    }
}
