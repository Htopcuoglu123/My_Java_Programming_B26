package day29_;

public class Initials {
    public static void main(String[] args) {
        String[] names = {"James Bond", "Eve Rell", "Anna Johnson", "    Willy Orange"};

        for (int i = 0; i < names.length; i++) {
            String fullName = names[i].trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();//or indexOf(" ")+1 without trim()
            System.out.println(" " + fullName.charAt(0) + lastName.charAt(0));
        }
        System.out.println();
        for (String str : names) {
            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();//or indexOf(" ")+1 without trim()
            System.out.println(" " + fullName.charAt(0) + lastName.charAt(0));

            //System.out.println(str.trim().substring(0,1)+str.trim().substring(str.indexOf(" ")).trim().charAt(0));
        }
    }
}