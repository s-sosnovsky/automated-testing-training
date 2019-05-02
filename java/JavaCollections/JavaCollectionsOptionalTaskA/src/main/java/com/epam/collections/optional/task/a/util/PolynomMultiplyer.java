package com.epam.collections.optional.task.a.util;

import com.epam.collections.optional.task.a.model.Polynom;
import com.epam.collections.optional.task.a.model.PolynomTerm;
/**
 * Created by Sery on 05.04.2019.
 */
public class PolynomMultiplyer {

    public static Polynom multiplyPolynoms(Polynom polynomFirst, Polynom polynomSecond) {
        Polynom polynomAfterMultiplication = new Polynom();
        int temporaryPolynomTermPower = 0;
        PolynomTerm temporaryPolynomTermCoefficient;
        for (int i = 0; i < polynomFirst.getPolynomLength(); i++) {
            for (int j = 0; j < polynomSecond.getPolynomLength(); j++) {
                temporaryPolynomTermCoefficient = polynomFirst
                        .getPolynomTerm(i)
                        .multiplyPolynomTerms(polynomSecond.getPolynomTerm(j));
                polynomAfterMultiplication.setPolynomTerm(temporaryPolynomTermCoefficient, temporaryPolynomTermPower);
                temporaryPolynomTermPower++;
            }
        }
        return polynomAfterMultiplication;
    }
}
