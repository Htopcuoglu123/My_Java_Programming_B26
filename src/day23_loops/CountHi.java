package day23_loops;

public class CountHi {

    public static void main(String[] args) {

        String str = "hilalhilalhihilal";
        int count = 0;

        for (int index = 0; index < str.length()-1; index++) {//index<=str.length()-1

            if (str.charAt(index) == 'h' && str.charAt(index + 1) == 'i') {
                count++;
            }

        }
        System.out.println(count);
        //if you check for characters next to the current index
        //using:i+1
        //then you should also stop it early as well
        //using  i<str.length()-1

    }
}

