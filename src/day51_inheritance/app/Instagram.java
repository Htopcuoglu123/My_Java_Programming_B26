package day51_inheritance.app;

import day51_inheritance.app.App;

public class Instagram extends App {
    /*
    Create a class Instagram

    - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram

     */
    public Instagram(double version){
        super("Instagram",version);
    }

    public void postPicture(){
        System.out.println("Posting picture to instagram");
    }

}
