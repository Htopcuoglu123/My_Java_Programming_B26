package March29th;

public class FeetAndInchesToCentimeters {
    public static void main(String[] args) {
        System.out.println(converter(0,5));
        System.out.println(converter(5));
    }

    public static double converter(double feet, double inches) {
        double result = 0;
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        double cm = ((feet * 12) + inches) * 2.54;
        return cm;

    }
    public static double converter(double inches){
        if(inches<0){
            return -1;
        }
        double feet=(int)inches/12;
        double remainingInches=inches%12;
        double cm=converter(feet,remainingInches);
        return cm;
    }

}
