package day48_encapsulation.Book;

public class Book {
    /*
    Create a class named Book,
        -5 Instance variables : String name, category, author, bookID;
                              int shelfNum(assign it with respect to categories );

        -1 Static variable :    int bookCount; (initiate it in a static block)

        -3 constructors : name /// name + category /// name + category + author  (implement constructor chaining)

        -2 methods : 1- toString()
                     2- IDgenerator() -> assign shelfNum and assign bookID with that format; ShelfNum_AuthorNameInitial_BookNameFirst2letters
                     (eg: adventure book =>  Moby Dick / Herman Melville; bookID= 1_H_Mo)

                                        Categories:  - Adventure (shelfNum = 1)
                                                     - Classics (shelfNum = 2)
                                                     - Comics (shelfNum = 3)
                                                     - Fantasy (shelfNum = 4)
                                                     - History (shelfNum = 5)
                                                     - Otherwise (shelfNum = 0)
     */
    String name;
    String category;
    String author;
    String bookId;
    int shelfNumber;

    static int bookCount;
    static{
        bookCount=0;
    }

    public Book(String name){
        this.name=name;
     //   idGenerator();I cannot assign this here because I did not assign the values that I need
        //for this method yet. If I put it here it will give a null pointer error
    }
    public Book(String name,String category){
        this(name);
        this.category=category;
        bookCount++;//every new book object creation my counter will increase
      //  idGenerator();
    }
    public Book(String name,String category,String author){
        this(name,category);
        this.author=author;
        idGenerator();//I can use this method here because all the  values that I need are assigned
    }
    public void idGenerator(){
        switch(category.toLowerCase()){
            case"adventure":
                shelfNumber=1;
                break;
            case "classic":
                shelfNumber=2;
                break;
            case "comics":
                shelfNumber=3;
                break;
            case "fantasy":
                shelfNumber=4;
                break;
            case "history":
                shelfNumber=5;
                break;
            default:
                shelfNumber=0;
                break;

        }
        bookId=shelfNumber+"_"+author.charAt(0)+"_"+name.substring(0,2);

    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", bookId='" + bookId + '\'' +
                ", shelfNumber=" + shelfNumber +
                '}';
    }
}

