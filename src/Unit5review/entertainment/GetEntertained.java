package Unit5review.entertainment;

public class GetEntertained {
    public static void main(String[] args) {
        Netflix nextflix=new Netflix(1.23,"Bad Boys",12,4);
        System.out.println(nextflix.episodeNum);
        System.out.println(nextflix.company);
        System.out.println(nextflix.seasonNum);
        System.out.println(nextflix.showName);

        System.out.println();

        KevinHeart kevinHeart=new KevinHeart("NTV","Chicago","Jimmy Joe","2/2/2022");
        System.out.println(kevinHeart.date);
        System.out.println(kevinHeart.name);
        System.out.println(kevinHeart.performer);
        System.out.println(kevinHeart.company);

        System.out.println();
        //Youtube youtube=new Youtube("NTV",60,"Spring","BBC",1200);
    }
}
