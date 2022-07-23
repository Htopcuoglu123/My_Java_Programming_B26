package day43_custom_classes;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        char[]reversed=new char[arr.length];


        for(int i=arr.length-1, j=0;i>=0;i--,j++){
            reversed[j]=arr[i];

        }
        System.out.println(Arrays.toString(reversed));
    }
    }

