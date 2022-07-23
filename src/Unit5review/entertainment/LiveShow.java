package Unit5review.entertainment;

public class LiveShow extends Entertainment{
    String location;

    public LiveShow(String company, String location, String s) {
        super("LiveShow", company);
        this.location = location;
    }
}
