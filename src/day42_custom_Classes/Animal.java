package day42_custom_Classes;

public class Animal {
    String species;
    long population;

    public String toString(){//this is a nice way of printing
        String print="Species: "+species;
        print+="\nPopulation: "+population;
        return print;
    }
    //Instead of printing 3 different line we created a toString
    //method so we can print altogether
    //System.out.println(bird);

}
//        System.out.println(cydeo.name);
//        System.out.println(cydeo.version);
//        System.out.println(cydeo.isFree);