package day29_;

public class ShortestAndLongestStrings {
    public static void main(String[] args) {
        /*
        Write a program that can return the shortest string element from a
String array
        Write a program that can return the longest string element from a
String array
         */
        String []strs={"java","apple","computer","water"};
        String smallest=strs[0];//if we assign empty space no other word will be smaller than that
        String biggest=strs[0];
//        for(int i=0;i<strs.length;i++){
//            if(strs[i].length()>biggest.length()){
//                biggest=strs[i];
//            }
//            if(strs[i].length()<smallest.length()){
//                smallest=strs[i];
//            }
//        }

        System.out.println();

        //with for each loop
        for(String word:strs){
            if(word.length()>biggest.length()){
                biggest=word;
            }
            if(word.length()<smallest.length()){
                smallest=word;
            }
        }





        System.out.println("My biggest string: "+biggest);
        System.out.println("My biggest string: "+smallest);



    }
}
