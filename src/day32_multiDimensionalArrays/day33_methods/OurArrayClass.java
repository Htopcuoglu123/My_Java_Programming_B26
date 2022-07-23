package day32_multiDimensionalArrays.day33_methods;

public class OurArrayClass {
    /*
    all will accept array argument
    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the middle element/s
     */
    public static void firstElement(int []nums){
        System.out.println("First element: "+nums[0]);
    }
    public static void lastElement(int []nums){
        System.out.println("Last element: "+nums[nums.length-1]);
    }
    public static void middleElement(int []nums) {
        if (nums.length % 2 == 1) {
            System.out.println("Middle element: " + nums[nums.length / 2 + 1]);
        } else {
            System.out.println("First middle element: " + nums[nums.length / 2-1]);
            System.out.println("Second middle element: "+ nums[nums.length / 2]);
        }
    }
    public static void printArray(int[]nums){
        String result="START| ";
        for(int num:nums){
            result+=num+"~";
        }
       result+=" |END";
        System.out.println(result);
    }


    public static void main(String[] args) {
       int []numbers={50,0,10,500,20,40,124};
       firstElement(numbers);
       lastElement(numbers);
       middleElement(numbers);
        System.out.println();

        int []numbers2={50,0,10,500,20,40,124,19};
        firstElement(numbers2);
        lastElement(numbers2);
        middleElement(numbers2);

        printArray(numbers2);
        printArray(new int[]{40,20,10});//just a different syntax to create and declare a new int array
    }



}
