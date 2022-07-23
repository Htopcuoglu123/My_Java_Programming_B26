package march22nd;

public class passingArguments {

    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum(3,4);
        int a=3;
        int b=4;
        sum((int) 3.3,4);
    }
}
