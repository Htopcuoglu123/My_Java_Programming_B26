package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abcdabcabcad";
        String unique="";

        for (int i = 0; i <s.length(); i++) {
            char letter=s.charAt(i);
            if(unique.contains(""+letter)){
                continue;
            }else{
                unique+=letter;
            }
            for (int j = 0; j < s.length(); j++) {

            }
            System.out.println(unique);

        }

    }
}

