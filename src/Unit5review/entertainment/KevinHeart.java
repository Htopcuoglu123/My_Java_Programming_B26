package Unit5review.entertainment;

public class KevinHeart extends LiveShow {
    String performer;
    String date;

    public KevinHeart(String company,String location,String performer,String date){
        super("LiveShow",company,location);
        this.performer=performer;
        this.date=date;
    }


}
