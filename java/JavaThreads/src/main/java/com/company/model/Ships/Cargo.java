package com.company.model.Ships;

import com.company.model.Harbor;
import com.company.model.Ship;

/**
 * Created by Sery on 25.03.2019.
 */
public class Cargo extends Ship {
    private final int CARGO_CAPACITY = 6;
    private final int CARGO_AVERAGE_RUNS_PER_SHIFT = 5;

    public Cargo (Harbor harbor, String shipName){
        super(harbor, shipName);
        this.setContainersOnShip((int) (Math.random()*CARGO_CAPACITY));
        this.setShipCapacity(CARGO_CAPACITY);
        this.setShipRunsPerShift(CARGO_AVERAGE_RUNS_PER_SHIFT);

    }
    public Cargo(){}

}
