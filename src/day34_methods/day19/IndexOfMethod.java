package day34_methods.day19;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s="pen";
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));

        System.out.println(s.indexOf("x"));//will return -1 for the characters that doesnt exist
        System.out.println(s.indexOf("pe"));//will return the index for the first character only so it is 0
        System.out.println(s.indexOf("pz"));//even though we have a p, since we do not have pz in sequence it will return -1
        System.out.println(s.indexOf("pn"));//since pn doesnt exist in given sequence it will return -1
        System.out.println(s.indexOf("pz"));//-1
    }
}
