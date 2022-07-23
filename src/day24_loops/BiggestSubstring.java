package day24_loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        String s = "aaabbbbbbbcccccdddee";
        String a = s.substring(s.indexOf('a'), s.lastIndexOf('a'));
        int lena = a.length();
        String b = s.substring(s.indexOf('b'), s.lastIndexOf('b'));
        int lenb = b.length();
        String c = s.substring(s.indexOf('c'), s.lastIndexOf('c'));
        int lenc = c.length();
        String d = s.substring(s.indexOf('d'), s.lastIndexOf('d'));
        int lend = d.length();
        String e = s.substring(s.indexOf('e'), s.lastIndexOf('e'));
        int lene = e.length();
        boolean biggest_a = lena > lenb && lena > lenc && lena > lend && lena > lene;
        boolean biggest_b = lenb > lena && lenb > lenc && lenb > lend && lenb > lene;
        boolean biggest_c = lenc > lena && lenc > lenb && lenc > lend && lenc > lene;
        boolean biggest_d = lend > lena && lend > lenb && lend > lenc && lend > lene;
        boolean biggest_e = lene > lena && lene > lenb && lene > lenc && lenc > lend;


        for (int i = 0; i > s.length(); i++) {

        }
        if (biggest_a) {
            System.out.println(a);
        } else if (biggest_b) {
            System.out.println(b);

        } else if (biggest_c) {
            System.out.println(c);
        } else if (biggest_d) {
            System.out.println(d);
        } else if (biggest_e) {
            System.out.println(e);
        }
    }
}
