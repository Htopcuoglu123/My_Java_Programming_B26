package day64_functional_Interface.InterviewProjects;

public class FindMinNumInArray {
    //6.Array -- Find Minimum
    //Write a method that can find the maximum number from an int Array
    public static int min(int[]nums){
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i] <= min) {
                min=nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]nums={2,1,4,-2,42,21,-32,43};
        System.out.println(min(nums));
    }
}
