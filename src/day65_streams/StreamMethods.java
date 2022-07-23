package day65_streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //Creating Streams
        int[]arr={1,2,3,4,5};
        Arrays.stream(arr);

        List<Integer>list=new ArrayList<>(Arrays.asList(4,5,6,7,2));
        list.stream();

        //distinct(): allows you to remove duplicates
        List<Integer>list2=new ArrayList<>(Arrays.asList(4,4,4,1,1,1,5,5,6,6,6,6,6,7,7,2,2));
        System.out.println("distinct method "+list2.stream().distinct().collect(Collectors.toList()));
        /*
        .stream() converts the list to a stream
        .distinct() remove duplicate values
        .collect(Collectors.toList()) converts the stream back to a list
        list2=list2.stream().distinct().collect(Collectors.toList());//reassigning is fine
         */
        System.out.println("original list "+list2);//original list is the same, not changed
        int[]arr2={1,2,2,2,3,3,4,5,5,4,6,6,6,7,8,8,9,9,9};
        arr2=Arrays.stream(arr2).distinct().toArray();
        System.out.println(Arrays.toString(arr2));

        System.out.println();
        //skip(): skips the defined number of elements

        List<Integer>list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList()));
        //skip(4) will skip the first 4 elements
        System.out.println(list3.stream().skip(7).collect(Collectors.toList()));//since the original
        // list is not changed
        //it will start counting the first 7 from the beginning

        //collect(Collectors.toList()) we need to use this to be able to print  otherwise
        // it will not print it since stream is not a data structure

        System.out.println(list3.stream().skip(13).collect(Collectors.toList()));//there is only 10 elements
        // in th list but this
        //asks us to skip 13. It will still not give us exception it will just return an empty list

        String []arr3={"java","hello","pen","computer","world"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray()));

        System.out.println();

        //limit(): is used to keep a limited num of the elements
        List<Integer>list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));//will keep only the first 6 elements
        System.out.println(list4.stream().limit(5).skip(3).collect(Collectors.toList()));
        System.out.println(list4.stream().skip(3).limit(4).collect(Collectors.toList()));//will skip the first 3 and
        // starting from that point it will limit 4 of the elements so it will return 4,5,6,7

        System.out.println();

        //count()
        List<Integer>list5=new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,5,6,7,3,5));
        System.out.println(list5.stream().count());
        System.out.println(list5.stream().distinct().count());


        //Task:find how many characters in the String
        String s="aaabbbcccdddeee";
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));//I could have also done
        //
        System.out.println(Arrays.stream(s.split("")).distinct().count());

    }
}
