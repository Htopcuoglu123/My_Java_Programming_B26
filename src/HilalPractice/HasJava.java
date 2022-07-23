package HilalPractice;

public class HasJava {
    public static void main(String[] args) {
        String s="I am learning java. Java is fun but it is not easy.java java java!";
        s=s.toLowerCase().trim();
        int count=0;
        for (int i = 0; i <s.length()-3 ; i++) {
            if(s.substring(i,i+4).equals("java")){
                count++;
            }

        }
        System.out.println(count);
    }
}
