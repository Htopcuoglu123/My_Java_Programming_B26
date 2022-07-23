package day13_if_statements;

public class TernarySample {
    public static void main(String[] args) {
       int a=8;
       String evenOrOdd;
       if(a%2==0){
           evenOrOdd="Even";

       }
       else{
           evenOrOdd="Odd";
       }
        System.out.println("___________________________________________________________________-");
       String result=a%2==0?"Even":"Odd";
        System.out.println(evenOrOdd);
        System.out.println(result);
        System.out.println("_____________________________________________________________");
        int num=4;
        String posOrNeg;
        if(num<0){
            posOrNeg="negative";
        }
        else if(num>0){
            posOrNeg="positive";
        }
        else{
            System.out.println("zero");
        }
        System.out.println(evenOrOdd);

        System.out.println("______________________________________________________-");

        String posONeg1=(num<0)?"negative":(num>0)?"positive":"zero";
        System.out.println(posONeg1);

        int age=9;

        System.out.println("I will be \"9\" years old soon");
    }
}
