package day49_Inheritance;

public class Building {
    public static void main(String[] args) {
        Person obj=new Person();
        obj.name="James Bond";
        obj.age=40;
        obj.favHobby="spy stuff";
        obj.talk();
       // obj.study() we do not have access to this because
        // this was a method made in child class

        Student obj2=new Student();
        obj2.name="Jorge";
        obj2.age=10;
        obj2.favHobby="drawing";
        obj2.talk();
        //the above variables and methods are inherited from the Person class
        obj2.funLevel=100;
        obj2.study();
    }
}
