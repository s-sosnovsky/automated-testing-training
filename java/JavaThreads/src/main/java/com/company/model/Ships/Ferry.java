package com.company.model.Ships;

import com.company.model.Harbor;
import com.company.model.Ship;

/**
 * Created by Sery on 25.03.2019.
 */
public class Ferry extends Ship {
    private final int FERRY_CAPACITY = 4;
    private final int FERRY_AVERAGE_RUNS_PER_SHIFT = 7;

    public Ferry (Harbor harbor, String shipName){
        super(harbor, shipName);
        this.setShipCapacity((int) (Math.random()*FERRY_CAPACITY));
        this.setShipCapacity(FERRY_CAPACITY);
        this.setShipRunsPerShift(FERRY_AVERAGE_RUNS_PER_SHIFT);

    }
    public Ferry(){}

}
