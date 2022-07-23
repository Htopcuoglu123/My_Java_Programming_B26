package collectionsPractice;

import java.util.Arrays;

 class Practice {
//  public static void main(String[] args) {
//   String[][]arr={{"A","B","C"},{"D","E"}};
//   for (int i = 0; i <arr.length ; i++) {
//    for (int j = 0; j <arr[i].length ; j++) {
//     System.out.println(arr[i][j]+" ");
//     if(arr[i][j].equals("B")){
//      continue;
//     }
//    }
//    continue;
//   }
//
//  }
public static void main(String[] args) {
 String[] arr = {"A", "B", "C", "D"};
 for (int i = 0; i < arr.length; i++) {
  System.out.println(arr[i] + "");
  if (arr[i].equals("C")) {
   continue;
  }
  System.out.println("Work Done");
  break;
 }
}
}

