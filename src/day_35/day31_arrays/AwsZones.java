package day_35.day31_arrays;

public class AwsZones {
    public static void main(String[] args) {
        String app="etsy";
        String zones="us-east-1,us-west-1,us-west-2,us-west-3";
        String[]allZones=zones.split(",");
        for(String eachZone:allZones){
            System.out.println(app+" is deploying on "+eachZone);

            System.out.println();
        }
    }
}
