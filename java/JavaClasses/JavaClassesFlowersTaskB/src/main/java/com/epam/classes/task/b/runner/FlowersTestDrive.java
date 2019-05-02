package com.epam.classes.task.b.runner;

import com.epam.classes.task.b.model.Bouquet;
import com.epam.classes.task.b.util.BouquetCreator;
import com.epam.classes.task.b.util.BouquetSorter;
import com.epam.classes.task.b.logic.FlowersCashRegister;
/**
 * Created by Sery on 25.03.2019.
 */
public class FlowersTestDrive {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        bouquet.setBouquetOfFlowers(BouquetCreator.composeBouquetOfFlowers().getBouquetOfFlowers());
        System.out.println("Bouquet of flowers: \n" + bouquet.toString());
        System.out.println("Bouquet price is: " + FlowersCashRegister.getTotalPrice(bouquet) + "$\n");
        System.out.println("Bouquet of flowers sorted by freshness: \n" +
                BouquetSorter.sortFlowersByFreshness(bouquet));
        System.out.println("Bouquet of flowers sorted by freshness, price and stem length: \n" +
                BouquetSorter.sortFlowersByFreshnessAndPriceAndStemLength(bouquet));
        System.out.println("Bouquet of flowers with stems lengths between 10 and 30 cm: \n"
                + BouquetSorter.findFlowersWithStemLengthsInRange(bouquet,10,30));
    }
}
