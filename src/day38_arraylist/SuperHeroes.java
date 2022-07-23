package day38_arraylist;

import java.util.ArrayList;

public class SuperHeroes {
    public static void main(String[] args) {
        ArrayList<String> superHeroes=new ArrayList<>();
        superHeroes.add("IronMan");
        superHeroes.add("SpiderMan");
        superHeroes.add("Thor");
        superHeroes.add("Captain America");
        superHeroes.add("Hawkeye");
        System.out.println(superHeroes);
        superHeroes.remove(superHeroes.size()-1);
        System.out.println(superHeroes);
        System.out.println(superHeroes.remove("IronMan"));
        System.out.println(superHeroes.remove(0));
        System.out.println(superHeroes);
    }
}
