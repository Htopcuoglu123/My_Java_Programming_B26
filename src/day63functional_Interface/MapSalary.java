package day63functional_Interface;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {
    /*
    Create a map that has a couple data to use. The data will be a name as the
key and a salary as the value
Use the created map to find the following:
1.1 who has the maximum salary?
1.2 who has the minimum salary?
1.3 how many employees has the salary between 120k ~ 150K?
1.4 display the names of the employees who are making less than 218k?
1.5 increase the salary of each employee by 10K
     */
    public static void main(String[] args) {
        Map<String,Double>map=new HashMap<>();
        map.put("James", 70000.0);
        map.put("Jane", 124000.0);
        map.put("Ana", 140000.15);
        map.put("Jorge", 424525.23);
        map.put("Elza", 1231311.1);
        map.put("Peter", 131234.0);
       //1.1 who has the maximum salary?
        //1.2 who has the minimum salary?
       String nameForMax="";
       double maxSalary=0.0;//we can use double.MIN.VALUE numbers will never be lover than 0 so 0 will work also
       String nameForMin="";
       double minSalary=Double.MAX_VALUE;//biggest possible double value is a good starting value
        for (String key:map.keySet()) {//iterate through the keys
            double value=map.get(key);//we use get method to read the value by the key
            if(value>maxSalary){
                nameForMax=key;
                maxSalary=value;
            }
            if(value<minSalary){
               nameForMin=key;
               minSalary=value;
            }
        }
        System.out.println("Max Salary: "+nameForMax+"-$"+maxSalary);
        System.out.println("Min Salary: "+nameForMin+"-$"+minSalary);
        System.out.println();

        //1.3 how many employees has the salary between 120k ~ 150K?
        int counter=0;
        for(double value:map.values()){
            if(value>=120_000&&value<=150_000){
                counter++;
            }
        }
        System.out.println("Number over 120K and less than 150K: "+counter);
        System.out.println();

        //1.4 display the names of the employees who are making less than 218k?
        for (String name:map.keySet()) {
            if(map.get(name)<=218000){
                System.out.println(name);
            }
        }
//1.5 increase the salary of each employee by 10K
        for (String key:map.keySet()) {
            map.put(key,map.get(key)+10000);//map.get(key) use the key to get the value, adds 10000 to
            // the value and updates the key

        }
        System.out.println(map);
    }
}
