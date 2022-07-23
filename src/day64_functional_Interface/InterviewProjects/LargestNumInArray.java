package day64_functional_Interface.InterviewProjects;

public class LargestNumInArray {

    public static int largest(int []nums){
        int largest=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=largest){
                largest=nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int []nums={3,2,7,45,2,12};
        System.out.println(largest(nums));
    }
}
