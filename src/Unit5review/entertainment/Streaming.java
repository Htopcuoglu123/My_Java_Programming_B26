package Unit5review.entertainment;

public class Streaming extends Entertainment{
    double duration;
    public Streaming(String company,double duration) {
        super("Streaming", company);
        this.duration=duration;
    }

}
