package day14_if_statemnts;

import java.util.Scanner;

public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What year is it?");
        int year=scanner.nextInt();
        String pandemic;
        if(year>=1346&&year<=1353){
           pandemic="The Black death";
        }else if(year>=1665&&year<=1666){
            pandemic="The great Plague of London";
        }else if(year>=1770&&year<=1772){
            pandemic="Russian Plague";
        }else if(year>=1889&&year<=1890){
            pandemic="Flue pandemic";
        }else if(year==1916){
           pandemic="American polio epidemic";
        }else if(year>=1918&&year<=1920){
            pandemic="Spanish flue";
        }else if(year>=2009&&year<=2010){
           pandemic="H1N1 Swine Flu pandemic";
        }else if(year>=2014&&year<=2106){
           pandemic="West African Ebola epidemic";
        }else if(year==2020||year>=2022){
            pandemic="Covid-19";
        }else{
            pandemic="No Pandemic";
        }
        System.out.println(pandemic);

    }
}
