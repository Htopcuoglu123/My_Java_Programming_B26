package day54_abstraction.create;

public interface Create {
    public abstract void read();//public abstract part is grey because it is unnecessary

    void write();//any method made in the interface is public abstract by default
    // so we don't have to have the beginning part "public abstract"
}
