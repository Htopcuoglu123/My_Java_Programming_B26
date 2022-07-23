package day12_if_Statements.day20_strings;

public class RelativeChecker {
    public static void main(String[] args) {
        String name1="Hilal Turan";
        String name2="Tarkan Topcuoglu";
        if(name1.endsWith("Topcuoglu")){
            System.out.println("Yes, you are relatives");
        }else{
            System.out.println("Last names does not match!You are not relatives!");
        }
    }
}
