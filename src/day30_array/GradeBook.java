package day30_array;

import java.util.Scanner;

public class GradeBook {
    /*
    Gradebook
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

        String[]names={"James","Anna","Mike","Melissa"};
        int [] score={90,95,89,100};
        char[] letterGrade=new char[4];


        for(int i=0;i<=names.length-1;i++){
            for (int j = 0; j <score.length-1 ; j++) {
                if (score[j]>= 85) {
                   letterGrade[i] = 'A';
                }
                else if (score[j]>= 75) {
                    letterGrade[i] = 'B';
                }
                else if (score[j] >= 65) {
                    letterGrade[i] = 'C';
                }
                else if(score[j]<65) {
                    letterGrade[i] = 'D';
                }

            }
            System.out.println(names[i]+"|"+score[i]+"|"+letterGrade[i]);

            }


        }

    }

