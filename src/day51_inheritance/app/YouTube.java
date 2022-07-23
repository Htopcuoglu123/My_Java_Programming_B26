package day51_inheritance.app;

import day51_inheritance.app.App;

public class YouTube extends App {
    /*
    Create a class YouTube

    - YouTube class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        watchVideo()
            Example output: prints Watching java tutorial
     */
    public YouTube(double version){
        super("YouTube",version);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }

}
