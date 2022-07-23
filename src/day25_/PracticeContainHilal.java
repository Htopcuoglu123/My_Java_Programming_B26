package day25_;

import java.util.Scanner;

public class PracticeContainHilal {
    public static void main(String[] args) {
        String sent="Hilal is learning hilal.Hilal is working hard but java is hard. Hilal loves it hilal.";
        int countHilal=0;
        for(int i=0;i<sent.length()-4;i++){
            String everyFive=sent.substring(i,i+5);
            if(everyFive.equalsIgnoreCase("Hilal")){
                countHilal++;
            }
        }
        System.out.println(countHilal);
    }
}
