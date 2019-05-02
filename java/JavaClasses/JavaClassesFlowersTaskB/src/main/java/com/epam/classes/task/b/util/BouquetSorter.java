package com.epam.classes.task.b.util;
import com.epam.classes.task.b.model.Bouquet;
import com.epam.classes.task.b.model.Flower;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Sery on 29.03.2019.
 */
public class BouquetSorter {
    public static Bouquet sortFlowersByFreshness(Bouquet bouquet) {
        Collections.sort(bouquet.getBouquetOfFlowers(), (o1, o2) -> o1.getFreshness() - o2.getFreshness());
        return bouquet;
    }

    public static Bouquet sortFlowersByFreshnessAndPriceAndStemLength(Bouquet bouquet) {
        bouquet.getBouquetOfFlowers()
                .sort(Comparator.comparing(Flower::getFreshness)
                .thenComparing(Flower::getPrice)
                .thenComparing(Flower::getStemLength));
        return bouquet;
    }

    public static Bouquet findFlowersWithStemLengthsInRange(Bouquet bouquet, int minStemLength, int maxStemLength) {
        Bouquet bouquetOfRangedFlowers = new Bouquet();
        for (int i = 0; i < bouquet.getBouquetOfFlowers().size(); i++) {
            if ((bouquet.getBouquetOfFlowers().get(i).getStemLength() > minStemLength) &&
                    (bouquet.getBouquetOfFlowers().get(i).getStemLength() < maxStemLength)) {
                bouquetOfRangedFlowers.addFlowerToBouquet(bouquet.getBouquetOfFlowers().get(i));
            }
        }
        return bouquetOfRangedFlowers;
    }
}

