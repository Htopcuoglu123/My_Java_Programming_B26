package day36_methods;

public class Picture {
 public static void draw(){
     System.out.println("trying to draw");
 }
 public static void draw(String color){
     System.out.println("draw with "+color);

 }
 public static void draw(String color,String color2){
     System.out.println("drawing with color "+color+color2);
 }
 public static void draw(int size){
     System.out.println("drawing with size "+size);
 }
 //Not valid by just changing the parameter name
//    public static void draw(int length){
//        System.out.println("drawing with size "+length);
//    }
//   but if you added two int parameters than it will work

    public static void draw(int size,int length){//
        System.out.println("drawing with size "+size+length);
    }

     public static void draw(String color,int size){
     System.out.println("color with size");
 }
    public static void draw(int size,String color){
        System.out.println("size first "+size+ "with color "+color);
    }


}
