package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UseHobby {
    public static void main(String[] args) {
        ArrayList<Hobby>listOfHobbies=new ArrayList<>();
        Hobby hobby1=new Hobby("Ski",1000,true,true);
        listOfHobbies.add(hobby1);
        listOfHobbies.addAll(Arrays.asList(
                new Hobby("Soccer",300,true,false),
                new Hobby("RollerSkating",200,true,false),
                new Hobby("IceSkating",500,false,true),
                new Hobby("Dancing",800,false,true)));
        System.out.println(listOfHobbies);

        for (Hobby each:listOfHobbies) {
            each.doIt();
        }
        System.out.println("_________________________________________________________________");
        ArrayList<Hobby>indoorHobbies=new ArrayList<>(listOfHobbies);
        indoorHobbies.removeIf(each->each.isOutDoors);
        System.out.println("List of the hobbies that are indoors: "+indoorHobbies);
        System.out.println("__________________________________________________________________");
        ArrayList<Hobby>byMyself=new ArrayList<>(listOfHobbies);
        byMyself.removeIf(each->each.requiresOthers);
        System.out.println("List of the hobbies that does not require other's help: "+byMyself);
        System.out.println("__________________________________________________________________");
        ArrayList<Hobby>lowerThan500=new ArrayList<>(listOfHobbies);
        lowerThan500.removeIf(each->each.annualCost>500);
        System.out.println("Hobbies that cost less than $500: "+lowerThan500);

    }
}
