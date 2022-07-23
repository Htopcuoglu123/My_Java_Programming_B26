package day09_scanner;

public class GoForWalk {
    /*
    We want to go for a walk
    We can go for a walk if it is not raining and the temperature is above 70. There is no need to check the temperature if it is raining
     */
    public static void main(String[] args) {

        boolean isRaining=false;
        int temp=68;
        boolean shouldIWalk=!isRaining&&temp>=70;
        System.out.println(shouldIWalk);

    }

}
