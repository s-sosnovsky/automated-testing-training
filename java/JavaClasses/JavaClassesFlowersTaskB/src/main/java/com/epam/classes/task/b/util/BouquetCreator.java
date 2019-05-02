package com.epam.classes.task.b.util;
import com.epam.classes.task.b.model.*;
import com.epam.classes.task.b.model.WildFlowers.*;

import java.util.List;
import java.util.Random;

/**
 * Created by Sery on 25.03.2019.
 */
public class BouquetCreator {
    private static final int MAX_FLOWERS_OF_A_KIND_IN_BOUQUET = 5;

    public static Bouquet composeBouquetOfFlowers() {

        Random randomFlowersValue = new Random();
        Bouquet bouquetOfFlowers = new Bouquet();

        for (int i = 0; i < randomFlowersValue.nextInt(MAX_FLOWERS_OF_A_KIND_IN_BOUQUET)+1; i++) {
            bouquetOfFlowers.addFlowerToBouquet(new Thyme());
        }
        for (int i = 0; i < randomFlowersValue.nextInt(MAX_FLOWERS_OF_A_KIND_IN_BOUQUET)+1; i++) {
            bouquetOfFlowers.addFlowerToBouquet(new Chamomile());
        }
        for (int i = 0; i < randomFlowersValue.nextInt(MAX_FLOWERS_OF_A_KIND_IN_BOUQUET)+1; i++) {
            bouquetOfFlowers.addFlowerToBouquet(new Hypericum());
        }
        for (int i = 0; i < randomFlowersValue.nextInt(MAX_FLOWERS_OF_A_KIND_IN_BOUQUET)+1; i++) {
            bouquetOfFlowers.addFlowerToBouquet(new Lily());
        }
        for (int i = 0; i < randomFlowersValue.nextInt(MAX_FLOWERS_OF_A_KIND_IN_BOUQUET)+1; i++) {
            bouquetOfFlowers.addFlowerToBouquet(new Buttercup());
        }

        return bouquetOfFlowers;
    }

}
