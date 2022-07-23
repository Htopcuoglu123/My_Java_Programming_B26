package day56_polymorphism.webElement;

public class Google {
    public static void main(String[] args) {
        WebElement link=new Link();//created a link object with webElement reference
        WebElement input=new Input();//created an input object with webElement reference
        WebDriverUtil.clickElement(link);
        WebDriverUtil.clickElement(input);
        WebDriverUtil.clickElement(new Link());//making a new Link object with no reference
      /*
       String[]->array that stores String objects
       Link[]->array that stores Link objects
       */
       WebElement[]allElements=new WebElement[4];//created an array that will store objects from classes
        //that implement WebElement interface
        //[null,null,null,null]
        allElements[0]=link;//[Link obj,null,null,null]
        allElements[1]=input;//[Link obj,Input obj,null,null]
        allElements[2]=new Input();//[Link obj,Input obj,Input obj,null]
        allElements[3]=new Image();//[Link obj,Input obj,Input obj,Image obj]

    }
}
