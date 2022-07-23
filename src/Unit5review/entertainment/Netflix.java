package Unit5review.entertainment;

public class Netflix extends Streaming {
    String showName;
    int episodeNum;
    int seasonNum;

    public Netflix(double duration, String showName, int episodeNum, int seasonNum) {
        super("Netflix",duration);
        this.showName = showName;
        this.episodeNum = episodeNum;
        this.seasonNum = seasonNum;
    }
}

