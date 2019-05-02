package com.epam.classes.task.b.logic;

import com.epam.classes.task.b.model.Bouquet;
import com.epam.classes.task.b.model.Flower;

/**
 * Created by Sery on 26.03.2019.
 */
public class FlowersCashRegister {
    public static int getTotalPrice(Bouquet bouquet){
        int totalBouquetPrice = 0;
        for (Flower flower: bouquet.getBouquetOfFlowers()) {
            totalBouquetPrice += flower.getPrice();
        }
        return totalBouquetPrice;
    }
}
