package day11_if_statements.day22_loops;

public class AddNum1To500 {
    public static void main(String[] args) {
        int num=1;
        int result=0;
        while(num<=500){
            System.out.println(result+"+"+num+"="+(result+num));
            result+=num;
            num++;
        }
    }
}
