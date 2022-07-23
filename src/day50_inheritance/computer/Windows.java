package day50_inheritance.computer;

public class Windows extends Computer {
    public Windows(int memory){
        super("Windows",memory);//this line calls the parent constructor which sets the os
        //veriable to be "Windows and sets the memory variable to be the argument from
        //the window constructor


    }

}
