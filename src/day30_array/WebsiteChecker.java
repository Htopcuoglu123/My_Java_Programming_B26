package day30_array;

public class WebsiteChecker {
    /*
   Website checker
    Given some urls determine how many .com, .org, and .edu websites
there are. Also keep track of an ‘other’ category for websites that have
a different domain
    Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com,
nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com,
comcast.net, tamu.edu, utexas.edu,
     */
    public static void main(String[] args) {
        String [] websites={"bing.com","wikimedia.org","twitter.com","amazonaws.com","japanpost.jp","mysql.com","nasa.gov",
        "linkedin.com","ucla.edu","github.io","spotify.com","mozilla.org","nba.com"};

        int numOfCom=0;
        int numOfOrg=0;
        int numOfEdu=0;
        int numOfOther=0;


                for(int i=0; i<websites.length ; i++){

                    int Dot=websites[i].indexOf('.');

                    if(websites[i].endsWith(".com")){
                        numOfCom++;

                    }
                   else if(websites[i].endsWith(".org")){
                        numOfOrg++;
                    }
                  else  if(websites[i].endsWith(".edu")){
                        numOfEdu++;
                    }else{
                        numOfOther++;
                    }
                }
        System.out.println("Number of websites that ends with .com is:"+numOfCom);
        System.out.println("Number of websites that ends with .org is:"+numOfOrg);
        System.out.println("Number of websites that ends with .edu is:"+numOfEdu);
        System.out.println("Number of websites that ends with others is:"+numOfOther);
    }

}
