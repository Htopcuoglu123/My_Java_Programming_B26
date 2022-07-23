package day34_methods;

public class isNumberInArray {
    public static void numInArray(int [] nums, int num1){
        boolean hasNum1=false;
        for (int i = 0; i <nums.length ; i++) {

            if(nums[i]==num1){
               hasNum1=true;
               break;

            }else{
               hasNum1=false;
            }

        }
        System.out.println(hasNum1);
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9,0};
        int num1=1;
        numInArray(nums,num1);
    }
}

