package HilalPractice;

public class ParseMethodPractice {
    public static void main(String[] args) {
        String s="as23HY457j%";
        String letters="";
        String digits="";
        String specs="";
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isLowerCase(s.charAt(i))){
               letters+=s.charAt(i);
            }
            else if(Character.isUpperCase(s.charAt(i))){
                letters+=s.charAt(i);

            }else if(Character.isDigit(s.charAt(i))){
                digits+=s.charAt(i);
            }else{
                specs+=s.charAt(i);
            }

        }
        System.out.println(digits);
        System.out.println(letters);

       int sum=0;
        for (int i = 0; i <digits.length(); i++) {
            sum+=Character.getNumericValue(digits.charAt(i));
        }
        System.out.println(sum);
        System.out.println(specs);
        }

    }



