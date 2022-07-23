package day52_inheritance.season;

public class Fall extends Season {
    /*
    Create a class Fall

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Read A Book

     */
    public Fall(double highestAvTemp,double lowestAvTemp){
        super("Fall",highestAvTemp,lowestAvTemp);
    }
    @Override
    public String activity(){
        return "Read a book";
    }

}
