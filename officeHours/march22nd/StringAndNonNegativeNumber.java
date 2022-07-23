package march22nd;

public class StringAndNonNegativeNumber {
    public static void stringTimes(String s,int num){
        String str="";
        if(num>0){
            for (int i = 0; i <num ; i++) {
               str+=s;
            }
            System.out.println(str);
        }


    }

    public static void main(String[] args) {
        int num=3;
        String s="Hilal";
        stringTimes(s,num);
    }

}
