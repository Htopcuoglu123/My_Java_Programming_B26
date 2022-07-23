package day63functional_Interface;

import day56_polymorphism.webElement.Link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {

        //anytime you use a method with one parameter and does not return anything we can use consumer
        Consumer<Integer> printToN = n -> {
            for (int i = 0; i < n; i++) {
                System.out.print(i + " ");
            }
        };
        printToN.accept(50);//accept() method is the abstract method defined in the Consumer interface

        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Summer", "Pool", "Warm"));
        list.forEach(e -> System.out.println(e));
        list.forEach(e -> {
            System.out.println(e.charAt(0) + " " + e.charAt(e.length() - 1));
        });//print each first and last characters

        list.forEach(word->{
            if(word.length()<5){
                System.out.println(word);
            }
        });

    }
}
