//package day63functional_Interface.Practice;
//
//import java.util.Arrays;
//import java.util.function.Predicate;
//
//public class CheckPassword {
//    //Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
//    //		        Password must be at least have 8 characters long, and should not contain space
//    //		        Password should at least contain one upper case letter
//    //		        Password should at least contain one lower case letter
//    //		        Password should at least contain one special characters
//    //		        Password should at least contain a digit
//    public static Predicate<String> isStrongPswd = a -> {
//    int countUpper=0;
//    int countLower=0;
//    int countDigit=0;
//    int countSpecs=0;
//    if(a.length()<8||a.contains(" ")){
//        return false;
//    }
//        for (int i = 0; i <a.length() ; i++) {
//            if(Character.isLowerCase(a.charAt(i))){
//                countUpper++;
//            }
//            if(Character.isUpperCase(a.charAt(i))){
//                countLower++;
//            }
//            if(Character.isDigit(a.charAt(i))){
//                countDigit++;
//            }
//        }
//    };
//}