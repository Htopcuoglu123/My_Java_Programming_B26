package day09_scanner;

public class Discount {
    public static void main(String[] args) {
         /* Task;
        Get discount if it is a Friday and you are a policeOfficer or a teacher or a firefighter
        declare and assign
        is it weekend?
        Are you teacher?
        Are you a policeOfficer?
        Are you a fireFighter?
        Do you get discount?Must be weekend, teacher,police officer or firefighter.
         */
       boolean isItWeekend=true;
       boolean areYouATeacher=false;
       boolean areYouAPoliceOffice=false;
       boolean areYouAFireFighter=false;
       boolean getsDiscount=isItWeekend&&(areYouATeacher||areYouAPoliceOffice||areYouAFireFighter);
       System.out.println(getsDiscount);
    }
}
