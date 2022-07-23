package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    public static ArrayList<String>removeCountries(ArrayList<String>countries,int num){
        countries.removeIf(country->country.length()>=num);
        return countries;


    }

    public static void main(String[] args) {
        ArrayList<String>countries=new ArrayList<>(Arrays.asList("Japan",
                "Korea","United States","Turkey","United Kingdom",
                "Canada"));
        int num=7;
        System.out.println(removeCountries(countries,num));
    }
}
