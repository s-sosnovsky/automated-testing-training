package com.epam.classes.task.b.model;

import java.util.Random;

/**
 * Created by Sery on 25.03.2019.
 */
public abstract class Flower {
    private int FLOWER_SHOP_WORKER_LEVEL = 5;
    private int freshness;
    private int stemLength;
    private int price;

    public Flower(int freshness, int stemLength, int price) {

        this.freshness = freshness + (int)(Math.random()*FLOWER_SHOP_WORKER_LEVEL + 1);
        this.stemLength = stemLength * (int)(Math.random()*FLOWER_SHOP_WORKER_LEVEL + 1);
        this.price = price * (int)(Math.pow(Math.random()*FLOWER_SHOP_WORKER_LEVEL+1, 2));

    }

    public Flower(){}

    @Override
    public String toString() {
        return "Flower: unknown but beautiful, " +
                "stemLength = "+ this.stemLength + " cm" +
                ", freshness = " + this.freshness + " hours" +
                ", price = " + this.price + " $";
    }

    public int getFreshness(){
        return freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public int getPrice() {
        return price;
    }

    void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    void setPrice(int price) {
        this.price = price;
    }

}