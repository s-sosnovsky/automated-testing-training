package com.epam.classes.task.b.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sery on 25.03.2019.
 */
public class Bouquet {

    private List<Flower> bouquetOfFlowers = new ArrayList<>();;

    public void setBouquetOfFlowers(List<Flower> bouquetOfFlowers) {
        this.bouquetOfFlowers = bouquetOfFlowers;
    }

    public Bouquet(List<Flower> bouquetOfFlowers){
        this.bouquetOfFlowers = bouquetOfFlowers;
    }

    public Bouquet(){}

    public List<Flower> getBouquetOfFlowers() {
        return bouquetOfFlowers;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Flower flower : bouquetOfFlowers) {
            builder.append(flower.toString() + "\n");
        }
        return builder.toString();
    }

    public void addFlowerToBouquet(Flower flower){
        this.bouquetOfFlowers.add(flower);
    }


}
