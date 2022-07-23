package day48_encapsulation.Rectangle;

public class Rectangle {
    /*

    create a class called Rectangle

        - data:

            length, width

        - constructor

            - create a constructor that creates a Rectangle object with the length and the width

            	call setters here

        - encapsulate the Rectangle class

        	- setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable

        - other methods methods:

            - calculateArea()
  				calculate and return the area of a Rectangle

            - calculatePerimeter()
  				calculate and return the perimeter of a Rectangle

            - toString()
                print the length, width, area, and perimeter of the Rectangle object

    Create a separate class to create and test the Rectangle objects

     */
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double length,double width){
        setLengthAndWidth(length,width);
    }
    public void setLengthAndWidth(double length,double width){
        if(length>0&&width>0){
            this.length=length;
            this.width=width;
        }else{
            System.out.println("Numbers need to be positive");
        }
    }

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        area= length*width;
        return area;
    }

    public double calculatePerimeter(){
       perimeter=(length+width)*2;
       return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}


