package day34_methods;

public class EqualTo180Or360 {
    /*
    Create a method that will that accepts three numbers. Check if the three
numbers equal to 180.
If they are equal to 180 print: "This is a triangle"
If they are equal to 360 print: "This is a circle"
     */
    public static void triangleOrCircle(int num1,int num2,int num3){
        if(num1+num2+num3==180){
            System.out.println("This is a triangle");
        }else if(num1+num2+num3==360){
            System.out.println("This is a circle");
        }else{
            System.out.println("Not a triangle or circle");
        }
    }

    public static void main(String[] args) {
        triangleOrCircle(120,40,20);
    }
}
