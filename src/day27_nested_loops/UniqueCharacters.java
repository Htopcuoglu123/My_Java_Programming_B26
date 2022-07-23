package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s="AAABCCDEEF";
        String unique="";
        for (int i = 0; i <s.length() ; i++) {
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
                if(count==1){
                    unique+=s.charAt(i);

                }

            }

            System.out.println(unique);
        }
    }

