package com.company.model;
import java.util.concurrent.atomic.AtomicInteger;
/**
 * Created by Sery on 04.03.2019.
 */
public class Harbor{
        private static final int AVERAGE_HARBOR_CAPACITY = 15;
        private static final int MAX_HARBOR_CAPACITY = 25;
        private AtomicInteger harborCapacity = new AtomicInteger();
        private int maxCargoCapacity;

    public static int getMaxHarborCapacity() {
        return MAX_HARBOR_CAPACITY;
    }

    public static int getAverageHarborCapacity() {
        return AVERAGE_HARBOR_CAPACITY;
    }

    public Harbor(int harborCapacity, int maxHarborCapacity) {
        this.harborCapacity.set(harborCapacity);
        this.maxCargoCapacity = maxHarborCapacity;
    }

    public boolean loadContainerToHarbor() {
        if (harborCapacity.get() < maxCargoCapacity) {
            harborCapacity.incrementAndGet();
            return true;
        }
        return false;
    }

    public boolean unloadContainerFromHarbor() {
        if (harborCapacity.get() > 0) {
            harborCapacity.decrementAndGet();
            return true;
        }
        return false;
    }

    public int getContainersInHarbor() {
        return harborCapacity.get();
    }
}