package day45_custom_classes;

public class Hobby {
    String name;
    double annualCost;
    boolean isOutDoors;
    boolean requiresOthers;


    public Hobby(String name){
        this.name=name;
    }
    public Hobby (String name,double annualCost){
        this(name);
        this.annualCost=annualCost;
    }
    public Hobby(String name, double annualCost,boolean isOutDoors,boolean requiresOthers){
        this(name,annualCost);
        this.isOutDoors=isOutDoors;
        this.requiresOthers=requiresOthers;
    }
    public void doIt(){
        System.out.println("Doing "+name+" for $"+annualCost+(isOutDoors?" outdoors":" indoors"));
    }

    @Override
    public String toString() {
        return "Hobby name= " + name +
                ", annualCost=" + annualCost +","+
                (isOutDoors? " Outdoors,":" indoors,") +
                (requiresOthers?" requires others":" does not require others");
    }
}
