package day56_polymorphism.webElement;

public interface WebElement {
    /*
    create an interface WebElement
    create abstract methods:
        void click()
        String getText()
        void sendKeys(String txt)

bonus to try/think about, we will do example on the weekend:

    array or ArrayList of these objects that are similar
    looping those objects

     */
    void click();
    String getText();
    void sendKeys(String txt);

}
