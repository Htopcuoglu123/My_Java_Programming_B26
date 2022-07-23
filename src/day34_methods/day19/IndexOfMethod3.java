package day34_methods.day19;

public class IndexOfMethod3 {
    public static void main(String[] args) {
        String word = "definition";
        //             0123456789
        System.out.println("first i:" + word.indexOf('i'));
        System.out.println("Last i:" + word.lastIndexOf('i'));
        System.out.println("second i:" + word.indexOf('i', 4));//first i is in the position of 3 so we start looking after 3 which is 4
        System.out.println("third i" + word.indexOf('i', 6));//since I have the second i in the position of 5 it will start looking for the third i from index number 6//  }
    }
}
