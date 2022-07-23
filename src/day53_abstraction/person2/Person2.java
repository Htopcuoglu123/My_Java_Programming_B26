package day53_abstraction.person2;

public abstract class Person2 {
    String name;
    int age;
    public Person2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void leavesHome();

    public abstract void eatsLunch();

    public abstract void action();
}
