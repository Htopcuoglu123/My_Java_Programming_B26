package HilalPractice;

public class CamelCase {
    public static void main(String[] args) {
        String sent="Today is a beautiful spring day";
        String camelCase=sent.charAt(0)+"";
        for (int i = 1; i <sent.length() ; i++) {
          if(sent.charAt(i-1)==' '){
              camelCase+=sent.substring(i,i+1).toUpperCase();
          }else{
              camelCase+=sent.charAt(i);
          }

        }
        System.out.println(camelCase.replace(" ",""));

    }
}
