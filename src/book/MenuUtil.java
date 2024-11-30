package book;

import library.book.Book;
import library.book.Library;

import java.util.Scanner;

public class MenuUtil {
    public static void printText(){
        System.out.println("_____________________________________");
        System.out.println("Please select: ");
        String text="1. Add a new book : \n" +
                "2. Print all books : \n" +
                "3. Remove any book : \n" +
                "4. Update book : \n" +
                "5. Search for a book by name : \n" +
                "6. Exit program!";
        System.out.println(text);
        System.out.println("___________________________________");
    }
    public static void newBook(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Book name : ");
        String name= sc.next();
        System.out.println("Book code : ");
        String code= sc.next();
        System.out.println("Book quantity : ");
        long quantity= sc.nextLong();
        library.book.Book book= new library.book.Book();
        book.setName(name);
        book.setCode(code);
        book.setQuantity(quantity);

        LibraryUtil.addBook(book);
    }
    public static void removeAnyBook(){
  Scanner sc= new Scanner(System.in);
        System.out.println(" Please enter the code : ");
        String code= sc.next();
LibraryUtil.removeBook(code);
    }
   public static void getAllBooks(){
        LibraryUtil.printBook();
   }
   public static void updateBook(){
        Scanner sc= new Scanner(System.in);
       System.out.println("Please enter the code : ");
        String code= sc.next();
        LibraryUtil.updateBook(code);
   }
public static void getBookByName(){
        Scanner sc= new Scanner(System.in);
    System.out.println("Please enter the book name : ");
        String name= sc.next();
LibraryUtil.searchBookByName(name);
}
}
