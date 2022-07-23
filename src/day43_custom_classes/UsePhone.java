package day43_custom_classes;

public class UsePhone {
    public static void main(String[] args) {
        Phone phone1=new Phone("IPhone X");//this one calls the first constructor
        System.out.println(phone1);
        Phone phone2=new Phone("IPhone 12","Apple");
        System.out.println(phone2);//calls the second constructor
        Phone phone3=new Phone("Galaxy s 22","Samsung",128,10.2);
        System.out.println(phone3);

    }
}
