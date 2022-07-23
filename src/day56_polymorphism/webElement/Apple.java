package day56_polymorphism.webElement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {
        Form obj=new Form();
        Link obj2=new Link();
        Input obj3=new Input();
        Image obj4= new Image();

        ArrayList<WebElement>elements=new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());//we made an object with no reference

        for(WebElement each:elements){
            System.out.println(each.getText());
            //((Form)each).submit();this will give Exception error because not every element
            // is an object of Form or related to Form
            if(each instanceof Form){//Are you an object of Form?
                ((Form)each).submit();//since webElement does not have access to submit method and
                // only the Form objects has the access to the submit method we are checking
            }
        }
        /*
        without instanceof  part you would be trying to cast all the object
        to Form but those objects don't have is a relations to form

        (Form)Link obj
        (Form)Image obj
        (Form)Input obj
         */

        WebElement logo=new Image();
        logo.click();//click method is accessible by the WebElement interface reference
        //then execution happens on obj side
        //logo.extension=".png";WebElemenyt interface does not know this method and does not have the accessibility
        //to the variable
        //option 1
        ((Image)logo).extension=".png";//the reference is cast fro this line

        //((Image)logo) casting the logo (WebElement reference) to image reference then
        // the image reference has access to the extension variable

        //option 2, but we created a new object in this option
        Image logoAsImage=((Image)logo);
        logoAsImage.extension=".png";
    }
}