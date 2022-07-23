package day35b_methods;

public class FixFormat {
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
     */
    public static String fixFormat(String word){
        word=word.toLowerCase();
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }

//    public static void main(String[] args) {
//        System.out.println(fixFormat("hiLAl"));
//    }
}
