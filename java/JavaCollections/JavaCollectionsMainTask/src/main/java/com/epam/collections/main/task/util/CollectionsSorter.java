package com.epam.collections.main.task.util;
import java.util.List;

/**
 * Created by Sery on 30.03.2019.
 */
public class CollectionsSorter {

    public static List<Integer> sortCollectionWitoutTempVariable(List<Integer> list) {

        for (int i = 0; i < list.size(); ++i) {
            sortColectionWithBoundaryValue(list, i);
        }
        return list;
    }

    private static void sortColectionWithBoundaryValue(List<Integer> list, int boundaryValue) {
        for (int j = list.size() - 1; j > boundaryValue; --j) {
            if (list.get(j - 1) > list.get(j)) {
                swapTwoElementsOfCollection(j, j - 1, list);
            }
        }
    }

    private static void swapTwoElementsOfCollection(int index1, int index2, List<Integer> list) {
        list.set(index2, list.get(index2) + list.get(index1));
        list.set(index1, list.get(index2) - list.get(index1));
        list.set(index2, list.get(index2) - list.get(index1));
    }
}
