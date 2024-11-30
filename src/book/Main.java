package book;
public class Main {
    public static void main(String[] args) {
        Book book=new Book("Java", "Leyla");
        System.out.println(book.getTitle()+" "+book.getAuthor());
        Book newbook= new Book("Backend","Aysu");
        book.updateTitle(newbook);
        System.out.println(book.getTitle()+" "+ book.getAuthor());
    }

}