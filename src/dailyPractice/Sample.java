package dailyPractice;

public class Sample {

    public static boolean isTrue(String a, String b){
        if(a.contains(b)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTrue("hilal","Topcuoglu"));
    }
}
