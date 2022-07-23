package day52_inheritance.season;

public class Summer extends Season{
    /*
    Create a class Summer

	child class of Season

	constructor: set values to variables

	methods:
		activity(): Drink Lemonade
     */
    public Summer(double highestAvTemp,double lowestAvTemp){
        super("Summer",highestAvTemp,lowestAvTemp);
    }
    @Override
    public String activity(){
        return "Drink lemonade";
    }

}
