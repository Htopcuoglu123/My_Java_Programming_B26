import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);
        int i=500;
        nums.remove(i);
        System.out.println(nums);
        nums.remove(500);//will give error since it will be out bounds. 500 will be read as index number(int number).
        nums.remove(Integer.valueOf(200));


    }



}
