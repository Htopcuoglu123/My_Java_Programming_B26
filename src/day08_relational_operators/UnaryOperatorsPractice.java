package day08_relational_operators;

public class UnaryOperatorsPractice {
    public static void main(String[] args) {
        int x = 2 + 3 * 2 / 1;//8
        System.out.println(x);
        System.out.println("_____________________________________");
        int y = (2 + 3) * 2;//10
        System.out.println(y);
        System.out.println("_____________________________________");

        int w = 78 / 2 * 2 + 3 - 5 % 5;
        System.out.println("w is " + w);
        /*
        39*2+3-5%5
        78+3-5%5
        78+3-0
        81
         */

        System.out.println("_____________________________________");
        int i=8+2+3+5-2-1-0+1*2;
        System.out.println("i is "+i);// 17

        System.out.println("_____________________________________");

        int a=8;//8->7
        int b=a--;//8
        System.out.println(a);//7
        System.out.println(b);//8

        System.out.println("_____________________________________");

        int a1=1;
        int b1=-a-- + a++ /-a-- * --a;

        System.out.println(a1);
        System.out.println(b1);

        System.out.println("_____________________________________");

        int L=50;//50->49->50->49->50
        int P= --L + L++ + L-- + L++;
        //      49 + 49  + 50  + 49
        System.out.println(L);//50
        System.out.println(P);//197

        System.out.println("_____________________________________");

        int X=4;//
        int Y=X*4-X++;

        System.out.println(X);//4
        System.out.println(Y);//12

        System.out.println("_____________________________________");

        int t=100;//100->101->101->100->101->100
        int p= - ++t * -t-- / t++ + --t;
          //    -101 * -101 / 100 + 100
        System.out.println(t);//100
        System.out.println(p);//202

        System.out.println("_____________________________________");

        int R = 20;//20 -> 19 -> 20 -> 19 -> 18
        int W = -R-- + -R++ + --R * R-- %2;//negative is only for this line.It doesn't affect the first line.Find the values first and then do the addition, subtraction etc.
        /*      -20  + -19  +  19 * 19  %2
                -20  + -19  +     361 %2
                -20  + -19  +   1
                -39+1
                -38
         */


        System.out.println("R is: "+R);// why is it 18?
        System.out.println("W is: "+W);//38

        System.out.println("_____________________________________");

        int M = 300;
        int N = 400;
        //int U = ++M + N++ - M-- %2 + --N %2;
        int z= ++M - M-- %2;


        System.out.println(M);
        System.out.println(N);
        System.out.println(z);

        int e=1;//1-> 0->  1-> 0->-1
        int f=-e-- + e++ / -e-- * --e;
        //    -1   + 0   / -1   * -1
        //    -1   + 0 *-1
        //    -1+0
        //    -1
        System.out.println(e);//-1
        System.out.println(f);//-1















    }

}
