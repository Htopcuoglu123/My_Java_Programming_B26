package day13_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number.\n1 for English\n2 for Spanish " +
                "\n3 for Turkish \n4 for Russian \n5 for French");
        int num=scan.nextInt();
        //String message;
        if(num==1){
           // message="Hello, thank for your call";
            System.out.println("Hello, thank for your call");
        }
        else if(num==2){
           // message="Hola, gracias para llamar";
            System.out.println("Hola, gracias para llamar");
        }
        else if(num==3){
            //message="Merhaba, aradiginiz icin tesekkurler"
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        else if(num==4){
            //message="privet, spasibo za vash zvonok";
            System.out.println("Privet, spasibo za vash zvonok");
        }
        else if(num==5){
            //message="Merci ,pour votre appel";
            System.out.println("Merci ,pour votre appel");
        }
        else{
            //message="Invalid Number";
            System.out.println("We will use English as default");
        }
        //System.out.println(message);
    }
}
