package day47_encapsulation.TrafficLights;

import day47_encapsulation.TrafficLights.TrafficLigth;

public class Road {
    public static void main(String[] args) {

        TrafficLigth light=new TrafficLigth("grey");

//        System.out.println(light.color);
//        light.color="pink";

        TrafficLigth ligth2=new TrafficLigth("red");
        System.out.println(ligth2.getColor());

        TrafficLigth light3=new TrafficLigth("Black");
        System.out.println(light3.getColor());

        ligth2.setColor("grey");
        System.out.println(ligth2.getColor());
    }
}
