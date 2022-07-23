package Unit5review.quiz;

import Unit5review.quiz.File;

import java.util.ArrayList;

public class Module{
    /*
    create a class Module

  instance variables:
   - files (ArrayList of File objects)

  constructor:
   - no parameter -> create empty ArrayList object
   - initialize with given ArrayList of Files
    -> Use chaining

  methods:
   - toString: print all the quiz information
   - addFile(File): accept a File object and add the given File to the ArrayList
of Files of that module
     */
    ArrayList<File>files;
    public Module(){
        this.files=new ArrayList<File>();
    }
    public Module(ArrayList<File>files){
        this();
        files.addAll(files);
    }
    public void addFile(File file){
        files.add(file);
    }
    public void removeFile(File file){
        files.remove(file);
    }

    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }
}
