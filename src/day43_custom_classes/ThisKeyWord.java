package day43_custom_classes;

public class ThisKeyWord {
    int a=100;//instance variable

    public ThisKeyWord(int a){
        a=400;//local variable
        System.out.println(a);
        this.a=600;//this is reassigning the instance variable
    }
}
