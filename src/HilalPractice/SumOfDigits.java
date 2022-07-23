package HilalPractice;

public class SumOfDigits {
    public static void main(String[] args) {
        String str="s23d23h3h2h8kj12";
        System.out.println(sum("sd23h3h2h8kj12"));
       // System.out.println(total(str));
    }
  public static int sum(String s){
      String digits="";
      int sum=0;
      for (int i = 0; i <s.length() ; i++) {
          if(Character.isDigit(s.charAt(i))){
              digits+=s.charAt(i);
          }
      }
      for (int i = 0; i <digits.length() ; i++) {
          sum+=Integer.parseInt(digits.charAt(i)+"");
      }
      return sum;
  }
//public static int total(String str){
//        String num="";
//        int total=0;
//
//    for (int i = 0; i <str.length() ; i++) {
//        if(Character.isDigit(str.charAt(i))){
//            num+=str.charAt(i);
//        }else{
//            total+=Integer.parseInt(num);
//            num="0";
//        }
//    }
//    return total+Integer.parseInt(num);
//}


}
