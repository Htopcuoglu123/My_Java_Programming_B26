package day27_nested_loops;

public class UniqueCharacters2 {
    public static void main(String[] args) {
        /*
         Unique Characters

            Write a program that can return the unique chars  from  a  string

            String str = "aabdfccfs";

            Output : bds

            Small Task --> Find me first Unique Char from the String
         */
        String str="aabdfccfs";

        //if there are two of the same character there is different numbers for indexOf and lastIndexOf but if there is only of
       // of that character they will be equal

       for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            boolean isUnique=str.indexOf(each)==str.lastIndexOf(each);

            if(isUnique){
                System.out.print(each);
            }
        }
    }
}
