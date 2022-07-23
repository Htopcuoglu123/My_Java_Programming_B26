package day_35.day31_arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String []words={"knife","wooden spoons","plates","cups","forks","pan","pot","trash can","fridge","dish washer"};
        for(String each:words){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }
    }
}
