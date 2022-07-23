package day27_nested_loops;

public class DuplicateCharacters3 {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (!checked.contains("" + str.charAt(i))) {

                int count = 0;

                for (int j = 0; j < str.length(); j++) {

                    if (str.charAt(i) == str.charAt(j)) {

                        count++;
                    }

                }
                checked += str.charAt(i);
                if (count >= 2) {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
}


