package day42_custom_Classes;

import java.util.Scanner;

public class UsingApp {
    public static void main(String[] args) {
        App cydeo=new App();

        cydeo.name="Cydeo";
        cydeo.version=5.5;
        cydeo.isFree=true;
//we cannot call instance methods like this
//        App.ran();
//        App.update();


        cydeo.run();
        cydeo.update();

        System.out.println(cydeo.name);
        System.out.println(cydeo.version);
        System.out.println(cydeo.isFree);

        new App().run();//this creates an object that has no referance
        //and calls the run method.
        System.out.println(new Scanner(System.in).nextLine());

        App samsung=new App();
        samsung.name="Samsung";
        samsung.version=4.3;
        samsung.isFree=false;

        System.out.println(samsung.name);
        samsung.run();
        System.out.println(samsung.version);
        samsung.update();

    }
}
