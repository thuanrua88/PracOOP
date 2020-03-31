package PracOOP;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.String.*;

public class Book {
    private String name;
    private double price;
    private int qty;
    Author[] author;

    public Book(String name, Author[] author, double price){
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book(String name, Author[] author, double price, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return format("Book[name='%s', price=%s, qty=%d, author=%s]", name, price, qty, Arrays.toString(author));
    }
    public String getAuthorName(){
        String au = "";
        for (int i = 0; i < getAuthor().length; i++){
            au += getAuthor()[i].getName() + ", ";
        }
        return au;
    }
}
