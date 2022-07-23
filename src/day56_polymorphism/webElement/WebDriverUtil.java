package day56_polymorphism.webElement;

public class WebDriverUtil {
    /*
    create a class WebDriverUtil
    create a method called clickElement that accepts the WebElement type and calls the click method from those object
     */

    public static void clickElement(WebElement webElement){
        webElement.click();//parameter is our reference/ our parameter is webElement so we can use this method with
        //all the objects that implements webElement can use this method
    }
}
