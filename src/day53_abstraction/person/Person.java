package day53_abstraction.person;

public abstract class Person {
    /*
    Create a class Person

make this class abstract

define variables:
    name, age

define abstract method:
    hobby()
     */
    String name;
    int age;

    public Person(String name, int age) {
        this.age=age;
        this.name=name;
    }

    public abstract void hobby();


}



