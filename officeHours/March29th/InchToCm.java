package March29th;

public class InchToCm {
    public static double inchToFeetConverter(int inches){
        double inchToFeetConverter=0;
        if(inches<0){
            return -1;

        }else{
            inchToFeetConverter=inches*0.083;
        }
        return inchToFeetConverter;
    }

    public static void main(String[] args) {
        System.out.println(inchToFeetConverter(13));
    }
}
