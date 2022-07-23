package day56_polymorphism.webElement;

public class Image implements WebElement{

    String extension;
    @Override
    public void click() {
        System.out.println("Clicking the image");
    }

    @Override
    public String getText() {
        return "Text Desc.";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Uploading images");
    }
}
