package day35b_methods;

public class CamelCase {
    public static String camelCase(String sent){
        sent=sent.toLowerCase().trim();
        String fixed=sent.substring(0,1)+"";
        for (int i = 1; i <sent.length() ; i++) {
            if(sent.charAt(i-1)==' '){
                fixed+=sent.substring(i,i+1).toUpperCase();

            }else{
                fixed+=sent.charAt(i);
            }

        }

        return fixed.replace(" ","");
    }

    public static void main(String[] args) {
        System.out.println(camelCase("Today is a rainy day"));
    }
}
