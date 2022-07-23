package day52_inheritance.season;

public class Spring extends Season {
    /*
    Create a class Spring

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Go Outside
     */
    public Spring(double highestAvTemp,double lowestAvTem){
        super("Spring",highestAvTemp,lowestAvTem);
    }

    public String activity(){
        return "Go outside";
    }
}
