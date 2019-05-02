package com.company.model.Ships;

import com.company.model.Harbor;
import com.company.model.Ship;

/**
 * Created by Sery on 25.03.2019.
 */
public class MotorBoat extends Ship {
    private final int MOTOR_BOAT_CAPACITY = 2;
    private final int MOTOR_BOAT_AVERAGE_RUNS_PER_SHIFT = 10;

    public MotorBoat (Harbor harbor, String shipName){
        super(harbor, shipName);
        this.setContainersOnShip((int) (Math.random()*MOTOR_BOAT_CAPACITY));
        this.setShipCapacity(MOTOR_BOAT_CAPACITY);
        this.setShipRunsPerShift(MOTOR_BOAT_AVERAGE_RUNS_PER_SHIFT);
    }

    public MotorBoat(){}

}


