package day48_encapsulation.static_imports;

import java.util.Arrays;
import static java.util.Arrays.*;//this line imports all the static members from the
//Arrays class
import static java.lang.Math.*;
import static my_utilities.StringUtil.reverse;
public class WithImport {
    public static void main(String[] args) {
        int []a={4,12,5,25};
       sort(a);
        System.out.println(PI);
        System.out.println(abs(-1));
        System.out.println(reverse("apple"));
    }
}
