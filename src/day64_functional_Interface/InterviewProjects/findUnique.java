package day64_functional_Interface.InterviewProjects;

public class findUnique {
    /*
    4) String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF"
     */
    public static String findUnique(String s){
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result+=s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findUnique("aabbdresf"));
    }
}
