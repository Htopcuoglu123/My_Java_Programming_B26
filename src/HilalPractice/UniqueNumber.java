package HilalPractice;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 3, 1};

        for (int i = 0; i < nums.length - 1; i++) {

            int count = 0;

            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(nums[i]);
            }

        }
    }
}


