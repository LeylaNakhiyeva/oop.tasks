package book;

import library.book.Book;
import library.book.Library;

import java.util.Scanner;

import static library.book.Library.bookCounts;
import static library.book.Library.books;

public class LibraryUtil {
    public static void addBook(library.book.Book book){
        if (bookCounts>= books.length*0.8) {
            library.book.Book[] newbook= new Book[books.length*2];
            for (int i=0; i<bookCounts; i++){
                newbook[i]=books[i];
            }
            books=newbook;
        }
        books[bookCounts]=book;
        bookCounts++;
    }
    public static void removeBook(String code){
        boolean check= false;
        for (int i=0; i<bookCounts; i++){
            Book book= books[i];
            if (code.equals(book.getCode())){
                books[i]=null;
                check=true;
            }
        }
        if (check) System.out.println("Book saccesfully deleted : ");
        else System.out.println("Book not found");
    }
    public static void updateBook(String code){
        Scanner sc=new Scanner(System.in);
        boolean check= false;
        for (int i=0; i<bookCounts; i++){
            Book book= books[i];
            if (code.equals(book.getCode())){
                System.out.println("Enter new name : ");
            books[i].setName(sc.next());
                System.out.println("Enter new quantity : ");
            books[i].setQuantity(sc.nextLong());
                System.out.println("Enter new code : ");
            books[i].setCode(sc.next());
            check=true;
        }
        }
        if(check) System.out.println("Book successfully updated : ");
        else System.out.println("Book not found");

    }
    public static void printBook(){
        for (int i = 0; i< Library.bookCounts; i++){
            Book book= Library.books[i];
            System.out.println(i+1+"-ci book : "+book.getName());
        }
    }
    public static void searchBookByName(String name){
        boolean check= false;
        for (int i=0; i<bookCounts; i++){
            Book book=books[i];
            if (name.equals(book.getName())){
                System.out.println("Information about this book : \n" +
                        "name : " +book.getName() +"\n"+
                        "code : "+book.getCode() +"\n"+
                        "quantity : "+ book.getQuantity()+"\n");
                check= true;
            }
        }
        if (check) System.out.println("Book information was provided!");
        else System.out.println("No book was found with this name!");
    }
}
