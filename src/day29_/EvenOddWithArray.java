package day29_;

public class EvenOddWithArray {
    public static void main(String[] args) {
        int[]nums={4,1,3,12,5};
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even++;
            }
            if(nums[i]%2==1){
                odd++;
            }
        }
        System.out.println("Number of even numbers: "+even);
        System.out.println("Number of odd numbers: "+odd);

        System.out.println();
        //with Saim

        int [] numbers={4,1,3,12,5};
        int even1=0;
        int odd1=0;
        String evens="";
        String odds="";
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]%2==0) {
                even1++;
                evens+=numbers[i]+" ";
            }
            if(numbers[i]%2==1){
                odd1++;
                odds+=numbers[i]+" ";
            }

        }
        System.out.println("Even counter: "+even1);
        System.out.println("Odd counter: "+odd1);
        System.out.println("Even Numbers:"+evens);
        System.out.println("Odd Numbers:"+odds);

        System.out.println();

        int [] nums2={4,1,3,12,5};
        int even2=0;
        int odd2=0;
        String evens2="";
        String odds2="";
        for(int each:nums2){
            if(each%2==0){
                even2++;
                evens2+=each+" ";
            }
            else{
                odd2++;
                odds+=each+" ";
            }

        }

        System.out.println("Last num of evens "+even2);
        System.out.println("Last even numbers "+evens2);
        System.out.println("Last num of odds "+odd2);
        System.out.println("Last odd numbers "+odds2);
    }
}
