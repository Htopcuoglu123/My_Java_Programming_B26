package day15_switchStatements;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeLevel=1;
        String location,teacher;
        int numOfGroups;
        numOfGroups=0;
        location="";
        teacher="";


        if(gradeLevel>0&&gradeLevel<=6){
            if(gradeLevel==1){
                teacher="Ms. Smith";
                location="Apple Orchard";
                numOfGroups=3;

            }
            else if(gradeLevel==2){
                teacher="Mr. Lee";
                location="Zoo";
                numOfGroups=7;

            }
            else if(gradeLevel==3){
                teacher="Ms. Wilson";
                location="Aquarium";
                numOfGroups=5;
            }
            else if (gradeLevel==4){
                teacher="Ms. Reyes";
                location="Movie theater";
                numOfGroups=2;
            }
            else if(gradeLevel==5){
                teacher="Ms. Lela";
                location="Museum";
                numOfGroups=5;

            }
            else{
                teacher="Mr.Watt";
                location="Six Flags";
                numOfGroups=8;

            }
            System.out.println("Grade level:"+gradeLevel);
            System.out.println("Teacher in charge: "+teacher);
            System.out.println("Location:"+location);
            System.out.println("Number of Groups:"+numOfGroups);
        }else{
            System.out.println("Grade must be between 1-6 to join the field trip");
        }
    }
}
