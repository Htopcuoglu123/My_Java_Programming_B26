package day30_array;

import java.util.Scanner;

public class Countries {
    /*
    Countries
Given a String array of countries:
String[] countries = {
"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
"Albania", "Portugal", "Philippines", "Armenia", "Colombia",
"Honduras", "Indonesia", "United States"
};
- Find and print all the first and last characters of each country
- Find and print all the countries that end with the letter ‘a’
- Create “contains logic” to check if there is a certain country in the array. Can check for
the United States, or use Scanner to check any country
     */
    public static void main(String[] args) {
        String countriesEndWithA="";
        boolean contains=false;
        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };
        Scanner input=new Scanner(System.in);
        System.out.println("Write name of the country that you want to check for");
        String country= input.nextLine();
        for(int i=0;i<countries.length;i++){
            if(country.equalsIgnoreCase(countries[i])){
                contains=true;
            }
            if(countries[i].endsWith("a")){
                countriesEndWithA+=countries[i]+" ";

            }

            System.out.println(""+countries[i].charAt(0)+countries[i].charAt(countries[i].length()-1));
        }

        System.out.println("Coutries that end with the letter a:" +countriesEndWithA);
        System.out.println("Does the list contains "+country+": "+contains);
    }
}
