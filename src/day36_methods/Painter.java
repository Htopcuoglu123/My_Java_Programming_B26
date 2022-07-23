package day36_methods;

public class Painter {
    public static void main(String[] args) {
        //using the methods from Picture
        Picture.draw();//this will run the first one

        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("blue","red");
        String s="200";
        Picture.draw(s);
        //This will call the second method(draw(String color)) since
        //this has a String value and the second method is
        // the first one that has a String value/It cares about the
        //type
        Picture.draw(200,"blue");

    }
}
