package day56_polymorphism.webElement;

public class Link implements WebElement {
//    create a class Link
//    implement the WebElement interface and implement all abstract methods


    @Override
    public void click() {
        System.out.println("Click the button");
    }

    @Override
    public String getText() {
        return "input text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Today is Friday! Happy Friday");
    }
}
