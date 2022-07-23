package day28_array;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums={500,120,-80,250,-10};
        int max=nums[0];//instead of 0 use the first number in the array
        int min=nums[0];//instead of 0 use the first number in the array
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if(nums[i]>max){
                max=nums[i];

            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Max:"+max);
        System.out.println("Min:"+min);

    }
}
