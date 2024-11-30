package restaurant;

public class Meal {
    private String mealName;
    private double price;
    private String category;
    private String code;
    private long quantity;
public String getMealName(){
    return mealName;
}
public void setMealName(String mealName){
    this.mealName=mealName;
}
public double getPrice(){
    return price;
}
public void setPrice(double price){
    this.price=price;
}
public String getCategory(){
    return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public long getQuantity(){
        return quantity;
    }
    public void setQuantity(long quantity){
    this.quantity=quantity;
    }
}
