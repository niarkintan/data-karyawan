package com.example.inikuiss;
public class Makanan {
    private  int id;
    private  String title, describe;
    private  double rating;
    private  double price;
    private  int image;

    public Makanan(int id, String title, String describe, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.describe = describe;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescribe() {
        return describe;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
    public int getImage() {
        return image;
    }

}