package Unit5review.entertainment;

import day03_comments_escape_statements.Comments;

import java.util.ArrayList;
import java.util.Arrays;

public class Youtube extends Streaming {
    String videoName;
    String channelName;
    int viewCount;
    ArrayList<Comments> comments;

    public Youtube(String company, double duration, String videoName, String channelName, int viewCount, ArrayList<Comments> comments) {
        super(company, duration);
        this.videoName = videoName;
        this.channelName = channelName;
        this.viewCount = viewCount;
        this.comments = comments;
    }


}
