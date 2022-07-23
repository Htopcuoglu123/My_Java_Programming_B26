package day32_multiDimensionalArrays.day33_methods;

public class CountNumbers {
    /*
    count up to a certain number
    start from 0
    print all the nums up to number input
    method(10)-->0,1,2,3.....10
     */
    public static void count(int number){
        for(int i=0;i<=number;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        count(15);
        count(10);
        count(-100);//this will not going to work since we start from 0
    }
}
