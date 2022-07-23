package day65_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods1 {
    public static void main(String[] args) {

        //map method: This allows you to change every element from the stream, based on a lambda expression
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer>byTwo=list.stream().map(e->e*2).collect(Collectors.toList());//each element will be multiplied by two
        System.out.println(list);
        System.out.println(byTwo);

        List<String>days=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        List<String>abr=days.stream().map(day->day.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);
        System.out.println(abr);

        System.out.println();
        //filter():allows us to maintain only certain elements based on the lambda expression
        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer>evens=list2.stream().filter(p -> p % 2==0).collect(Collectors.toList());
        List<Integer>odds=list2.stream().filter(p -> p % 2==1).collect(Collectors.toList());
        System.out.println(list2);
        System.out.println(evens);
        System.out.println(odds);
        System.out.println(list2.stream().filter(p -> p % 2==0).count());
        System.out.println(list2.stream().filter(p -> p % 2==0).distinct().count());//finding how many unique even numbers there is

        List<String>str=new ArrayList<>(Arrays.asList("java","javascript","selenium","cypress","jAVa","hello world","JAVA"));
        long java=str.stream().filter(p -> {
            p=p.toLowerCase();
            return  p.contains("java");
        }).count();
        System.out.println(java);
        System.out.println(str.stream().filter(p->p.toLowerCase().contains("java")).collect(Collectors.toList()));

        System.out.println();
        //forEach

        List<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3.stream().filter(p->p%2==0).forEach(e-> System.out.println(e));//same with line 46
        list3.stream().filter(p->p%2==0).forEach(System.out::println);//same with line 45

        /*
        .stream() creating a stream from mu arraylist
        .filter() only keeping all the even numbers in stream
        .forEach() do an action by on the lambda expression
         */

        List<Integer> list4=new ArrayList<>(Arrays.asList(5,10,15,20,25,15));
        System.out.println("Divisible by 5 "+list4.stream().allMatch( p -> p % 5 == 0));
        System.out.println("Even: "+list4.stream().allMatch(p -> p % 2 == 0));
        System.out.println("More than 30 "+list4.stream().anyMatch(p->p>30));
        System.out.println("More than 20 "+list4.stream().anyMatch(p->p>20));
        System.out.println("None are above 30 "+list4.stream().noneMatch(p->p>30));


    }
}
