package day56_polymorphism.webElement;

public class Input implements WebElement{
    /*
    create a class Input
    implement the WebElement interface and implement all abstract methods
     */

    @Override
    public void click() {
        System.out.println("Click on the selected inputs");
    }

    @Override
    public String getText() {
        return "Input Text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Send keys");
    }
}
