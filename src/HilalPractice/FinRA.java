package HilalPractice;

public class FinRA {

    public static void main(String[]args){
        int num=100;
        for (int i = 1; i <100 ; i++) {
            String s="";
            if(i%3==0){
                s+="Fin";
            }
            if(i%5==0){
                s+="Ra";
            }
            System.out.print(s.isEmpty()?i+" ":s+" ");
        }


        }

    }

