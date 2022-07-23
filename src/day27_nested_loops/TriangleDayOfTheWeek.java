package day27_nested_loops;

public class TriangleDayOfTheWeek {
    public static void main(String[] args) {
        String day="Monday";
        for (int i = 0; i <day.length() ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(day.charAt(j));

            }
            System.out.println();

        }
    }
}
