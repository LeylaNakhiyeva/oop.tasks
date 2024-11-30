package library.book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            MenuUtil.printText();
            int number = sc.nextInt();
            switch (number) {
                case 1 -> MenuUtil.newBook();
                case 2 -> MenuUtil.getAllBooks();
                case 3 -> MenuUtil.removeAnyBook();
                case 4 -> MenuUtil.updateBook();
                case 5 -> MenuUtil.getBookByName();
                case 6 -> System.exit(0);
            }


        }


    }
}
