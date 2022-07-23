package replitPractice;

import java.util.Arrays;

public class practice {

        public static int maxTriple(int[] nums) {
            int largest=nums[0];
            if(nums.length==1){
                return nums[0];
            }
            if(nums.length>1){
                for(int i=1;i<nums.length;i++){
                    if(nums[i]>largest){
                        largest=nums[i];
                    }
                }
            }
            return largest;
        }

    public static void main(String[] args) {
            int []nums={5,7,3,2,1,4};
        System.out.println(maxTriple(nums));
    }

}