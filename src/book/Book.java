package book;

public class Book {
    private String title;
    private String author;

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void updateTitle(Book book){
        this.title=book.getTitle() ;
    }

     public Book(){

     }
     public Book(String title, String author){
        this.title=title;
        this.author=author;
     }
}
