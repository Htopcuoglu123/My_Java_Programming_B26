package day11_if_statements.day22_loops;

public class CategoryName {
    public static void main(String[] args) {
        String url="https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049";
        int startIndex=url.indexOf("c/");
        int endIndex=url.indexOf("?");
        String categoryName=url.substring(startIndex+2,endIndex);
        System.out.println(categoryName);
        categoryName=categoryName.replace("-"," ");
        System.out.println(categoryName);
        System.out.println("");
        if(categoryName.contains("/")){
            categoryName=categoryName.substring(0,categoryName.indexOf("/"));
            System.out.println(categoryName);
        }



    }
}
