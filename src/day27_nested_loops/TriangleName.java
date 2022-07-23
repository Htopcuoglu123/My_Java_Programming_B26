package day27_nested_loops;

public class TriangleName {
    public static void main(String[] args) {
        String name="Hilal";

        for (int i = 0; i <name.length() ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(name.charAt(j));

            }
            System.out.println();

        }
    }
}
