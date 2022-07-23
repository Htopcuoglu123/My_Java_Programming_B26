package day52_inheritance.season;

public class Winter extends Season{
    /*
    Create a class Winter

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Print Use Fireplace
     */
    public Winter(double highestAvTemp,double lowestAvTem){
        super("Winter",highestAvTemp,lowestAvTem);
    }
    @Override
    public String activity(){
        return "Use fireplace";
    }

}
