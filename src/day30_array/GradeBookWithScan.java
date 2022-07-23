package day30_array;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookWithScan {
    /*
    Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the grade book at the end with all the information
Grade scale:
Above 85: A
Above 75: B
Above 65: C
Other: D
Challenge: Accept all the
information with Scanner
   */
    public static void main(String[] args) {

int [] scores=new int[4];
char[]letterGrade=new char[4];
String [] names=new String[4];
Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <4 ; i++) {
                System.out.println("What is the name of the student?");
                names[i]=scanner.next();
                System.out.println("What is the score?");
                scores [i]= scanner.nextInt();
            if(scores[i]>85){
                letterGrade[i]+='A';
            }else if(scores[i]>75){
                letterGrade[i]+='B';
            }else if(scores[i]>65){
                letterGrade[i]='C';
            }else{
                letterGrade[i]='D';
            }


        }
        System.out.println(names[0]+"|"+scores[0]+"|"+letterGrade[0]);
        System.out.println(names[1]+"|"+scores[1]+"|"+letterGrade[1]);
        System.out.println(names[2]+"|"+scores[2]+"|"+letterGrade[2]);
        System.out.println(names[3]+"|"+scores[3]+"|"+letterGrade[3]);
        }

}

