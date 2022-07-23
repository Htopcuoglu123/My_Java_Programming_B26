package day_35.day31_arrays;

public class SumOfDigitsInArray {
    /*
    Write a method that accepts an array and prints the total of the numbers in the
        array, except ignore sections of numbers starting with a 6 and extending to the
        next 7 (every 6 will be followed by at least one 7).

            int[] x = {1,2,2} = > 5
            int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
            int[] a = {1,1,6,7,2} = > 4
            int[] b = {1,1,6,2} = > 2
            int[] c = {1,2,2,6,99,99,7,3,4} = > 12
     */
    public static void main(String[] args) {
        int []c={1,2,2,6,99,99,7,3,4};
        int indexOf6=-1;
        int indexOf7=-1;
        int sum=0;
        for(int i=0;i<c.length;i++) {
            if ((c[i] == 6)) {
                while(c[i]!=7){//will remove/count all the numbers from 6to7,once it is 7 while will stop
                    i++;
                }
            }
            else{
                sum=sum+c[i];
        }
            }
        System.out.println(sum);
        }


    }

