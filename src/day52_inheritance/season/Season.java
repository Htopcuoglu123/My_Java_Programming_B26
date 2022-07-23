package day52_inheritance.season;

public class Season {
    /*
    Create a class Season

	instance variables
		- name (String)
		- highest average temperature
		- lowest average temperature

	constructor:
		- initialize all fields

	methods:
		- activity(), toString()

		override activity in sub classes
     */
    String name;
    double highestAvTemp;
    double lowestAvTemp;

    public Season(String name,double highestAvTemp,double lowestAvTemp){
        this.name=name;
        this.highestAvTemp=highestAvTemp;
        this.lowestAvTemp=lowestAvTemp;
    }

    @Override
    public String toString() {
        return "Season:" +
                "\nname='" + name + '\'' +
                "\nhighestAvTemp=" + highestAvTemp +
                "\nlowestAvTemp=" + lowestAvTemp;
    }

    public String activity(){
        return "";
    }
}
