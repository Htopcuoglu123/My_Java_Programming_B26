package day64_functional_Interface.InterviewProjects;

public class DuplicateDigits {
    // // 1.1 Create a method that can verify if a number contains duplicate digits
    public static boolean hasDuplicateDigits(int n){
        String str=n+"";
        String uniques="";
        for (int i = 0; i <str.length() ; i++) {
            if(!uniques.contains(str.charAt(i)+"")){//first time a number digit found in our String
                uniques+=str.charAt(i);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicateDigits(1231));
    }
}
