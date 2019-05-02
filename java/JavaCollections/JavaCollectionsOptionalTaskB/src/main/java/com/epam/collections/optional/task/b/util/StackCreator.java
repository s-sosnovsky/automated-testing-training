package com.epam.collections.optional.task.b.util;

import java.util.Stack;

/**
 * Created by Sery on 05.04.2019.
 */
public class StackCreator {
    private static final int RANDOM_LIMIT_VALUE = 10;
    public static Stack<Integer> createAndFillStack(){
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < RANDOM_LIMIT_VALUE; i++) {
            stack.push((int)(Math.random()*RANDOM_LIMIT_VALUE) - RANDOM_LIMIT_VALUE/2);
        }
        return stack;
    }
}
