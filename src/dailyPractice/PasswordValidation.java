package dailyPractice;

public class PasswordValidation {
    /*
    2) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false

     */
    public static boolean passwordValidation (String s) {
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;
        String specials = "$, %, #, @, &, !, ?";

        if (s.length() >= 6 && !s.contains(" ")) {

            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    upper = true;
                }
                if (Character.isLowerCase(s.charAt(i))) {
                    lower = true;
                }
                if (Character.isDigit(s.charAt(i))) {
                    digit = true;
                }
                if (specials.contains(s.charAt(i) + "")) {
                    special = true;
                }
            }
            if (upper && lower && digit && special) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("!Ziy564"));
        System.out.println(passwordValidation("Ziy564"));
    }
}
