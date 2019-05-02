package com.epam.collections.optional.task.a.runner;

import com.epam.collections.optional.task.a.util.PolynomMultiplyer;
import com.epam.collections.optional.task.a.model.Polynom;

/**
 * Created by Sery on 05.04.2019.
 */
public class PolynomMultiplyerTestDrive {

    public static void main(String[] args) {
        Polynom polynomFirst = new Polynom(-1, 2, 1, -4);
        Polynom polynomSecond = new Polynom(1, 3, -2);
        System.out.println("First polynom: " + polynomFirst);
        System.out.println("Second polynom: " + polynomSecond);
        System.out.println("Resulting polynom after multiplication: "
                + PolynomMultiplyer.multiplyPolynoms(polynomFirst,polynomSecond));
    }
}
