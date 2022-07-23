package day12_if_Statements;

public class Letters {
    public static void main(String[] args) {
        char letter = 'Y';


        if(letter>='a'&&letter<='z') {
            System.out.println(letter);
            System.out.println("lowercase");
        }

       if (letter>='A'&&letter<='Z'){
            System.out.println(letter);
            System.out.println("uppercase");
        }

    }


}

