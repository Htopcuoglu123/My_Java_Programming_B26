package day63functional_Interface;
@FunctionalInterface
public interface DynamicInterface<T> {//T is a common name for Generic type which lets us use
    // any parameter(Object type)we want.
    //Generic makes it more flexible since it can be any object type
    void test(T t);   //T is for Generic type and t is parameter name


}
