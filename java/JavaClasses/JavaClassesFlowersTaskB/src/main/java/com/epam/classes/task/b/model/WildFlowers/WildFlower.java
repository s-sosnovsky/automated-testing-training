package com.epam.classes.task.b.model.WildFlowers;

import com.epam.classes.task.b.model.Flower;

/**
 * Created by Sery on 25.03.2019.
 */
public class WildFlower extends Flower {
    public static final int WILD_FLOWER_MIN_STEM_LENGTH = 5;
    public static final int WILD_FLOWER_MIN_MARKET_PRICE = 5;
    public static final int WILD_FLOWER_MIN_FRESHNESS = 5;
    public WildFlower(){}
    public WildFlower(int freshness, int stemLength, int price) {
        super(freshness, stemLength, price);
    }


        @Override
        public String toString() {
            return "Flower: charming unknown wild flower, " +
                    "stemLength = " + this.getStemLength() + " cm" +
                    ", freshness = " + this.getFreshness() + " hours" +
                    ", price = " + this.getPrice() + "$";
        }
    }

