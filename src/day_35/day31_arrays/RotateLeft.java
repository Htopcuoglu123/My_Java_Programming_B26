package day_35.day31_arrays;

import java.util.Arrays;

public class RotateLeft {
    /*
    Write a program that accepts an array and prints an array with the elements "rotated left”

		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
     */
    public static void main(String[] args) {
        int [] x={1,2,3,4,5};
        /*
        int temporary=x[0];-->1
        i=0->x[0]=x[1]->2,2,3,4,5
        i=1->x[1]=x[2]->2,3,3,4,5
        i=2->x[2]=x[3]->2,3,4,4,5
        i=3->x[3]=x[4]->2,3,4,5,5

        x[x.length-1]=temp;->2,3,4,5,1

        formula=x[i]=x[i+1];

         */
        int temp=x[0];

        for (int i = 0; i <x.length-1 ; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));


    }
}
