package com.epam.collections.main.task.runner;
import com.epam.collections.main.task.util.CollectionsSorter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Sery on 30.03.2019.
 */
public class CollectionsSorterTestDrive {

    private static int RANDOM_LIMIT_VALUE = 5;
    public static void main(String[] args) {

        List<Integer> testList= new ArrayList<Integer>(){
            {
                Random randomValue = new Random();
                for (int i = 0; i < 10; i++) {
                    this.add(randomValue.nextInt(RANDOM_LIMIT_VALUE *2)- RANDOM_LIMIT_VALUE);
                }
            }
        };

        System.out.println("Initial collection: \n" + testList);
        System.out.println("Sorted collection: \n" + CollectionsSorter.sortCollectionWitoutTempVariable(testList));
    }
}
