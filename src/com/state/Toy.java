package com.state;

/**
 * Created by Yelena_Khamitchina on 24.11.2016.
 */
public abstract class Toy {
    private int price;
    private String toyName;

    public Toy() {
    }

    public Toy(int price, String toyType) {
        this.price = price;
        this.toyName = toyType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

}
