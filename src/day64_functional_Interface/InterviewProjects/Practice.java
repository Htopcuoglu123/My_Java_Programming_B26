package day64_functional_Interface.InterviewProjects;

public class Practice {
    //String - Password Validation Task
    //Write a return method that can verify if a password is valid or not. Requirements:
    //1. Password MUST be at least 6 characters and should not contain space
    //2. Password should at least contain one upper case letter
    //3. Password should at least contain one lowercase letter
    //4. Password should at least contain one special characters
    //5. Password should at least contain a digit
    //6. if all requirements above are met, the method returns true, otherwise returns false

    public static boolean isValid(String password) {
boolean upper=false;
boolean lower=false;
boolean digit=false;
boolean specials=false;
String specs="@,#,$,%,&,?";
if(password.length()>=6&&!password.contains(" ")){
    for (int i = 0; i <password.length() ; i++) {
        if(Character.isDigit(password.charAt(i))){
            digit=true;
        }
        if(Character.isLowerCase(password.charAt(i))){
            lower=true;
        }
        if(Character.isUpperCase(password.charAt(i))){
            upper=true;
        }
        if(specs.contains(password.charAt(i)+"")){
            specials=true;
        }
    }
    if(specials&&digit&&lower&&upper){
        return true;
    }else{
        return false;
    }
}
return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("hr97HY&"));
    }
}