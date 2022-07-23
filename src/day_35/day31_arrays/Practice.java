package day_35.day31_arrays;

public class Practice {
    public static void main(String[] args) {
        int [] nums={1,5,5,1,1};
        boolean isEqual=true;

        for (int i = 0; i <=nums.length; i++) {

            if(nums[i]==5&&(nums[i+1])==nums[i]){

                isEqual=true;

            }else if(nums[i]==5&&nums[i+2]==5){

                isEqual=true;
            }else{
                isEqual=false;
            }

        }
        System.out.println(isEqual);

    }
}
