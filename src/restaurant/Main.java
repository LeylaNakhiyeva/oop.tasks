package restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Admin.enterAdminPage();
        System.out.println("Please select : ");
        String text="1. get admin page \n" +
                "2.";
        System.out.println(text);
          int num= sc.nextInt();
          switch (num){
              case 1 ->{
                  enterAdminPage();
              }
              case 2 ->{

              }
          }
    }
    public static void checkPassword(){
        Scanner sc= new Scanner(System.in);
        System.out.println(" Please enter the password : ");
        String code= sc.next();
      Admin.checkPassword(code);


    }


}
