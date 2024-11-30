package restaurant;

import java.util.Scanner;

public class Menyu {

    public static void addMeal(){
        Scanner sc= new Scanner(System.in);
        String mealName= sc.next();
        double price=sc.nextDouble();
        String category= sc.next();
        String code= sc.next();
        long quantity=sc.nextLong();
        Meal meal= new Meal();
        meal.setMealName(mealName);
        meal.setPrice(price);
        meal.setCategory(category);
        meal.setCode(code);
        meal.setQuantity(quantity);
    }
    public static void removeMeal(String code){
        Scanner sc= new Scanner(System.in);
        code= sc.next();
        // if(code.equals())
    }
    public static void showMeal(){

    }
}
