package com.epam.classes.task.b.model.WildFlowers;

/**
 * Created by Sery on 25.03.2019.
 */
public class Hypericum extends WildFlower {
    public Hypericum() {
        super(WILD_FLOWER_MIN_FRESHNESS, WILD_FLOWER_MIN_STEM_LENGTH,
                WILD_FLOWER_MIN_MARKET_PRICE);
    }


    @Override
    public String toString() {
        return "Wildflower:Hypericum, " +
                "stemLength = " + this.getStemLength() + " cm" +
                ", freshness = " + this.getFreshness() + " hours" +
                ", price = " + this.getPrice() + "$";
    }
}
