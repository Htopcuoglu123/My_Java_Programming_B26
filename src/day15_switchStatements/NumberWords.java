package day15_switchStatements;

public class NumberWords {
    /*
    Take a number and print the number as the word version
    1->one
    2->two
    3->three
    4->four
    5->five
     */
    public static void main(String[] args) {
        int numToWord=5;
        if(numToWord==1){
            System.out.println("One");
        }
        else if(numToWord==2){
            System.out.println("Two");
        }
        else if(numToWord==3){
            System.out.println("Three");
        }
        else if(numToWord==4){
            System.out.println("Four");
        }
        else if(numToWord==5){
            System.out.println("Five");
        }
        else{
            System.out.println("Invalid Number");
        }

         //As Switch
        switch(numToWord){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid Number");

        }
    }
}
