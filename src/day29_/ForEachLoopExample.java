package day29_;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int [] nums={30,12,159,12};
        for(int i=0;i<nums.length;i++){
            System.out.println("traditional loop: "+ nums[i]);
        }
        System.out.println();
        for(int element:nums){
            System.out.println("For each: "+element);
        }
        //String example
        String [] classes={"Java","Soft Skills","Selenium","Database","API"};
        for(int i=0;i< classes.length;i++){
            System.out.println("Traditional:"+classes[i]);
        }
        System.out.println();
        for(String each:classes){
            System.out.println("For each:"+each);
        }
        System.out.println();
        double [] prices={10.4,40.2,410.2};

        //for each
        for (double each:prices) {
            System.out.println("$ "+each);
        }
    }
}
