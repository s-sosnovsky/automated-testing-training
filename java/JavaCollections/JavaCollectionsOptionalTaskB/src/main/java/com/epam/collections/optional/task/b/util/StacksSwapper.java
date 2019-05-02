package com.epam.collections.optional.task.b.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 * Created by Sery on 05.04.2019.
 */
public class StacksSwapper {
    public static void swapStacks(Stack firstStack, Stack secondStack){

        Iterator<Integer> firstStackIterator = firstStack.iterator();
        Iterator<Integer> secondStackIterator = secondStack.iterator();

        ArrayList<Integer> firstStackListOfInteger = new ArrayList();
        ArrayList<Integer> secondStackListOfInteger = new ArrayList();

        while(firstStackIterator.hasNext()) {
            firstStackListOfInteger.add(firstStackIterator.next());
        }

        while(secondStackIterator.hasNext()) {
            secondStackListOfInteger.add(secondStackIterator.next());
        }

        firstStack.clear();

        for(int j = 0; j < secondStackListOfInteger.size(); j++) {
            firstStack.push(secondStackListOfInteger.get(j));
        }

        secondStack.clear();

        for(int j = 0; j < firstStackListOfInteger.size(); j++) {
            secondStack.push(firstStackListOfInteger.get(j));
        }
    }
}
