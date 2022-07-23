package day37_wrapper_arraylist;

public class HTMLPractice {
    //public static void main(String[] args) {
        /*
        HTML Generator

Given a String in the following format take the number part of the generator the html tags.
	Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

	Ex:
		Input:
			div^2
		Output:
			<div></div> <div></div>

	Ex:
		Input:
			li^3
		Output:
			<li></li><li></li><li></li>
         */
//        String s="li 2";
//
//        String part1=s.split("\\^ ")[0];
//        String result="";
//        System.out.println(part1);
//        String part2=s.split("\\^ ")[1];
//        int numPart=Integer.parseInt(part2);
//        System.out.println(part2);
//        String diamonds="></";
//        for (int i = 0; i <numPart ; i++) {
//            result+="<"+part1+diamonds+part1+"> ";
//
//        }
//        System.out.println(result);
//    }


    public static String htmlGenerate(String str){
        String html="";
        String[]parts=str.split("\\^");
        int repeat=Integer.parseInt(parts[1]);
        for (int i = 0; i <repeat ; i++) {
           html+="<"+parts[0]+">"+"</"+parts[0]+">";

        }
        return html;
    }

    public static void main(String[] args) {
        System.out.println( htmlGenerate("hilal^3"));
        System.out.println(htmlGenerate("div^3"));
    }
}
