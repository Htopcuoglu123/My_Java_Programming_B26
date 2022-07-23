package day56_polymorphism.webElement;

public class Runner {
    /*
    create a runner class to create objects of Link and Input with a focus on the interface references

     */
    public static void main(String[] args) {
        WebElement webElement=new Link();
        webElement.click();
        webElement.sendKeys("Today is a beautiful day!");
        webElement.getText();

        Link link=(Link)webElement;
        link.click();
        link.getText();
        link.sendKeys("Sending keys:))");

        WebElement webElement1=new Input();
        webElement1.click();

    }
}
