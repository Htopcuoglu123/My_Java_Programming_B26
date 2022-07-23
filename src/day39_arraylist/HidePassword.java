package day39_arraylist;

import java.util.ArrayList;

public class HidePassword {
    public static void main(String[] args) {
        ArrayList<String>passwords= new ArrayList<>();
        passwords.add("one");
        passwords.add("hola");
        passwords.add("merhaba");
        passwords.add("Monday");
        System.out.println(passwords);
        int num=passwords.get(0).length();
        for (int i = 0; i <passwords.size() ; i++) {
            int len=passwords.get(i).length();
            String s="";
            for (int j = 0; j <len ; j++) {
               s+="*";
            }
            passwords.set(i,s);
        }
        System.out.println(passwords);
    }
}
