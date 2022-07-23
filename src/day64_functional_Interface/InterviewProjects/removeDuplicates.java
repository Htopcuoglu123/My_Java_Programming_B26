package day64_functional_Interface.InterviewProjects;


    public class removeDuplicates {
        /*
        3) String - Remove Duplicates
        Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC") ==> ABC
         */
public static String removed(String str){
    String removed="";
    for (int i = 0; i <str.length() ; i++) {
        if(!removed.contains(str.charAt(i)+"")){
            removed+=str.charAt(i);
        }

    }
    return removed;
}

        public static void main(String[] args) {
            System.out.println(removed("aaaffsgghyjkksd"));
        }
    }