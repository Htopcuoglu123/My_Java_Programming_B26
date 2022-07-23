package HilalPractice;

public class NumOfCharacters {
    public static void main(String[] args) {
        String str="beautiful";
        String checked="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char letter=str.charAt(i);
            if(checked.contains(""+letter)){
                continue;
            }
            for (int j = 0; j <str.length() ; j++) {
                char letter1=str.charAt(j);
                if(letter==letter1){
                    count++;
                }

            }
            System.out.println(letter+"-"+count);
            checked+=letter;

        }


    }
}
