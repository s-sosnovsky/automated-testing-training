package com.company.runner;
import com.company.model.Ship;
import com.company.model.Ships.Cargo;
import com.company.model.Ships.Ferry;
import com.company.model.Harbor;
import com.company.model.Ships.MotorBoat;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Sery on 25.03.2019.
 */

public class ShipsTestDrive {
    public static void main(String[] args) {

        Harbor harbor = new Harbor(Harbor.getAverageHarborCapacity(), Harbor.getMaxHarborCapacity());
        List<Ship> shipsWorkingInHarbor = new ArrayList<>();
        shipsWorkingInHarbor.add(new MotorBoat(harbor, "Popular MotorBoat"));
        shipsWorkingInHarbor.add(new MotorBoat(harbor, "Fish MotorBoat"));
        shipsWorkingInHarbor.add(new MotorBoat(harbor, "Sport MotorBoat"));
        shipsWorkingInHarbor.add(new Cargo(harbor, "Honored Cargo"));
        shipsWorkingInHarbor.add(new Cargo(harbor, "Classic Cargo"));
        shipsWorkingInHarbor.add(new Cargo(harbor, "Military Cargo"));
        shipsWorkingInHarbor.add(new Ferry(harbor, "Old Ferry"));
        shipsWorkingInHarbor.add(new Ferry(harbor, "New Ferry"));
        for (Ship ship:shipsWorkingInHarbor) {
            new Thread(ship, ship.toString()).start();
        }

    }
}
