package day08_relational_operators;

public class UnaryOperatorsExamples {
    public static void main(String[] args) {
        int b = 10;
        b++;
        System.out.println(b);//11
        b--;
        System.out.println(b);//10
        System.out.println(b++);//10
        System.out.println(b++);//11
        System.out.println(b--);//12
        System.out.println(b--);//11
        System.out.println("__________________________________________________________________");

        int a = 40;
        System.out.println(a++);//40
        System.out.println(a++);//41
        System.out.println(a);//42
        System.out.println(a--);//42
        System.out.println(a--);//41
        System.out.println(--a);//39
        System.out.println(a--);//39
        System.out.println(a);//38
        a++;
        System.out.println(a);//39
        System.out.println("_______________________________________________________________________");

        int c = 14;
        c--;//13
        c++;//14
        --c;//13
        c--;//12
        c++;//13
        System.out.println(c);
        System.out.println("___________________________________________________________-");

        int d=14;
        System.out.println(d--);//14
        System.out.println(d++);//13
        System.out.println(--d);//13
        System.out.println(d--);//13
        System.out.println(d++);//12
        System.out.println(d);//13







    }

}
