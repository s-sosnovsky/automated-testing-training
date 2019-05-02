package com.company.model;

import java.util.Random;

/**
 * Created by Sery on 25.03.2019.
 */

public abstract class Ship implements Runnable{
    private com.company.model.Harbor harbor;
    private String shipName;
    private int shipRunsPerShift;
    private boolean shipIsOnRun;
    private Random delayInHarbor = new Random();

    public Ship(){}

    public Ship(Harbor harbor, String shipName){
        this.harbor = harbor;
        this.shipName = shipName;

    }

    public int getContainersOnShip() {
        return containersOnShip;
    }

    public void setContainersOnShip(int containersOnShip) {
        this.containersOnShip = containersOnShip;
    }

    private int containersOnShip;

    public int getShipCapacity() {
        return shipCapacity;
    }

    public void setShipCapacity(int shipCapacity) {
        this.shipCapacity = shipCapacity;
    }

    private int shipCapacity;

    public int getShipRunsPerShift() {
        return shipRunsPerShift;
    }

    public void setShipRunsPerShift(int shipRunsPerShift) {
        this.shipRunsPerShift = shipRunsPerShift;
    }



    @Override
    public String toString() {
        return this.shipName;
    }

    public void unloadContainerFromShip(){
        if (containersOnShip > 0) {
            if (harbor.loadContainerToHarbor()) {
                containersOnShip--;
                shipIsOnRun = true;
            }
        }
    }
    public void loadContainerToShip(){
        if (containersOnShip < shipCapacity) {
            if (harbor.unloadContainerFromHarbor()) {
                containersOnShip++;
                shipIsOnRun = true;
            }
        }
    }

     public void bothLoadAndUnloadContainerFromShip(){
         loadContainerToShip();
         unloadContainerFromShip();
     }

    @Override
    public void run() {
        for (int i = 0; i < shipRunsPerShift; i++) {
            String s = Thread.currentThread().getName() + " info: ";
            s += "containers in the harbor: " + harbor.getContainersInHarbor();
            s += ", containers on the ship: " + containersOnShip +" |";
            switch (containersOnShip) {
                case 0:
                case 1:
                    loadContainerToShip();
                    s+=" load 1 container to the ship |";
                    break;
                case 2:
                    bothLoadAndUnloadContainerFromShip();
                    s+=" both load and unload 1 container from the ship |";
                    break;
                default:
                    unloadContainerFromShip();
                    s+=" unload 1 container from the ship |";
                    break;

            }
            s += ", containers in the harbor: " + harbor.getContainersInHarbor();
            s += ", containers on the ship: " + containersOnShip;
            if (shipIsOnRun) System.out.println(s);

            try {
                Thread.sleep(delayInHarbor.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
