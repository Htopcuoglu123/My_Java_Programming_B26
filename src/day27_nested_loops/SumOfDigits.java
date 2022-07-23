package day27_nested_loops;

public class SumOfDigits {
    public static void main(String[] args) {
        /*
        SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3

             			output: 6
             					1+2+3
         */
        String str="A1B2C3";
        //str.charAt(1)-->returns char data
        System.out.println(str.charAt(1)-48+str.charAt(3)-48+str.charAt(5)-48);

        //on ascii table the decimal number for 0 is 48 and 49 for 1, 50 for 2 etc. so we subtract 48 from the number

        System.out.println("_____________________________________________________");

        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if(each>='0'&&each<='9'){
                sum+=each-48;

        }

        }
        System.out.println(sum);

    }
}
