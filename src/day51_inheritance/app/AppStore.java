package day51_inheritance.app;

public class AppStore {
    public static void main(String[] args) {
        YouTube obj2=new YouTube(2.3);
        System.out.println(obj2.name);
        obj2.download();
        obj2.watchVideo();
        System.out.println(obj2);

        Instagram obj1=new Instagram(2.2);
        System.out.println(obj1.name);
        obj1.download();
        obj1.postPicture();
        System.out.println(obj1);
    }
}
