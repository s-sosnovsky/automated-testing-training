package com.epam.collections.optional.task.b.runner;
import com.epam.collections.optional.task.b.util.StackCreator;
import com.epam.collections.optional.task.b.util.StacksSwapper;

import java.util.Stack;
/**
 * Created by Sery on 05.04.2019.
 */
public class StacksSwapperTestDrive {

    public static void main(String[] args) {

        Stack<Integer> firstStack = StackCreator.createAndFillStack();
        Stack<Integer> secondStack = StackCreator.createAndFillStack();
        System.out.println("First stack before swapping: " + firstStack);
        System.out.println("Second stack before swapping: " + secondStack);
        StacksSwapper.swapStacks(firstStack, secondStack);
        System.out.println("First stack after swapping: " + firstStack);
        System.out.println("Second stack after swapping: " + secondStack);

    }
}
