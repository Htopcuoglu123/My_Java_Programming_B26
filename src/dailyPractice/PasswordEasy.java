package dailyPractice;

public class PasswordEasy {
    public static boolean isTrue(String input){

            if(input.startsWith("cyd")){
                return true;
        }else{
                return false;
            }
    }

    public static void main(String[] args) {
        System.out.println(isTrue("Cydeo".toLowerCase()));
    }
}
