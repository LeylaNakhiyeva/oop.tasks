package restaurant;


import java.util.Scanner;

public class Admin {

   private String adminPassword;
   public void setAdminPassword(String adminPassword){
       this.adminPassword=adminPassword;
   }
   public String getAdminPassword(){
       return adminPassword;
   }
    public static void enterAdminPasssword(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter admin password : ");
        String adminPassword= sc.next();
        Admin admin= new Admin();
        admin.setAdminPassword(adminPassword);
   }
    public static void enterAdminPage(String password){
       Scanner sc= new Scanner(System.in);
        Admin admin= new Admin();
        boolean check= false;
        if (password.equals(admin.getAdminPassword())){
            System.out.println(" Please select : ");
            String text="1. add meal \n" +
                    "2. remove meal \n" +
                    "3. show meal \n";
            int number= sc.nextInt();
            switch (number){
            case 1 -> addMeal();
            case 2 -> removeMeal();
            case 3 -> showMeal();
        }
        check= true;
        }
        if (check) System.out.println("You have successfully entered the admin page! ");
        else System.out.println("The entered password is invalid!");
    }
    public static void addMeal() {
        Menu.addMeal();
    }
    public static void removeMeal(){
       Menu.removeMeal();
    }
    public static void showMeal(){
       Menu.showMeal();
    }
}
