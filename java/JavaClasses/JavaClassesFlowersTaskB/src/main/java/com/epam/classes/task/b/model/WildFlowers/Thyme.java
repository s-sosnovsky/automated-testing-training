package com.epam.classes.task.b.model.WildFlowers;

/**
 * Created by Sery on 25.03.2019.
 */
public class Thyme extends WildFlower {
    public Thyme() {
        super(WILD_FLOWER_MIN_FRESHNESS, WILD_FLOWER_MIN_STEM_LENGTH,
                WILD_FLOWER_MIN_MARKET_PRICE);
    }

    @Override
    public String toString() {
        return "Wildflower:Thyme, " +
                "stemLength = " + this.getStemLength() + " cm" +
                ", freshness = " + this.getFreshness() + " hours" +
                ", price = " + this.getPrice() + "$";
    }

}
