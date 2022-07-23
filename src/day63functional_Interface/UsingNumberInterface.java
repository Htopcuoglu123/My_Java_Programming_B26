package day63functional_Interface;

public class UsingNumberInterface {
    public static void main(String[] args) {
       NumberInterface evenOrOdd=(n)->{

           if(n%2==0){
               System.out.println(n+" is even");
           }else{
               System.out.println(n+" is odd");
           }
       };

        evenOrOdd.apply(11);//we used apply because we called that method as apply int NumberInterface
        evenOrOdd.apply(20);

        NumberInterface cube=(number)->{
            System.out.println(number*number*number);
        };

        //NumberInterface cube=3->System.out.println(number*number*number)
        cube.apply(5);
        cube.apply(7);
        System.out.println();
        NumberInterface duplicate=(n)->{
            System.out.println(n*n);

        };
        duplicate.apply(8);

        System.out.println();





    }


}
