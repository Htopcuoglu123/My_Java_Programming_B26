package day05_variables;

public class CharExamples {
    public static void main(String[] args) {

        //Assigning characters to char type

        char letterOne = 'a';

        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';


        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);
        System.out.println(letterOne+" "+letterTwo+" "+numberOne+" "+specialOne);
        System.out.println("chars: "+letterOne+letterTwo+numberOne+specialOne);//Since we have a string at the beginning "chars:" it will turn all the others as String.

    }
}
