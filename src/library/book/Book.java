package library.book;


import java.util.Scanner;

import static library.book.Library.*;

public class Book {
    public Book(){

    }
    private String name;
    private String code;
    private long quantity;
    public void setQuantity(long quantity){
        this.quantity=quantity;
    }
    public long getQuantity(){
        return quantity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }



}

