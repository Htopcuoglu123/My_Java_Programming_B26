package day24_loops;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {
        String s="2juMp41EEkd4s4";
        int numUpper=0;
        int numLower=0;
        int numNum=0;
        String upper="";
        String lower="";
        String nums="";
        for(int i=0;i<s.length();i++){
            char letter=s.charAt(i);//stores the character in the variable so it does not
            // need to call the method again and again
            if(letter>=65&&s.charAt(i)<=90){
                //if(letter>='A'&&letter<='Z')
                numUpper++;
                upper+=letter;
            }else if(letter>=97&&s.charAt(i)<=122){
                //if(letter>='a'&&letter<='z')
                numLower++;
                lower+=letter;
            }else if(letter>=48&&s.charAt(i)<=57){
                //if(letter<='0'&&letter>='9')
                numNum++;
                nums+=letter;
            }
            //It is better to use else if intead of single if at this project
            // because with single if the all three single ifs will run for each character

        }
        System.out.println(numUpper+" uppercase letters");
        System.out.println(upper);
        System.out.println(numLower+" lowercase letters");
        System.out.println(lower);
        System.out.println(numNum+" numbers");
        System.out.println(nums);
    }
}
