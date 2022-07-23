package day54_abstraction.day61_maps;

import java.util.HashMap;
import java.util.Map;

public class Classroom {

        /*
        rank
        1-student
        2-student
        3-student
        4-student
        5-student
         */
        public static void main(String[] args) {
            Map<Integer,Student>map=new HashMap<>();
            map.put(1,new Student("James",4.0,7));

            Student obj=new Student("Hannah",3.9,10);
            map.put(2,obj);
            map.put(3,new Student("Dianna",3.8,14));
            map.put(4,new Student("Jehad",3.7,29));
            System.out.println(map);

           // System.out.println(map.get(5));//this will return null
            //since we only have 4 objects

            System.out.println(map.get(1));
            System.out.println(map.get(4).name);

            //looping through the map
            System.out.println();

            System.out.println(map.keySet());

            for(int keys:map.keySet()){
                System.out.println("Rank: "+keys);
                System.out.println(map.get(keys));
                System.out.println();
            }

            System.out.println(map.values());
            //another way to loop by the value
            for (Student student:map.values()){
                if(student.id<=10){
                    System.out.println(student);
                }
            }

            //another way to loop
            for(Map.Entry<Integer,Student>entry:map.entrySet()){
                System.out.println("Rank: "+entry.getKey());
                System.out.println(entry.getValue());
                System.out.println();
            }
        }
}
