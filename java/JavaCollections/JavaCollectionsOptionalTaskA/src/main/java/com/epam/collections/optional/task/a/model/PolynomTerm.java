package com.epam.collections.optional.task.a.model;

/**
 * Created by Sery on 05.04.2019.
 */
public class PolynomTerm {

    final char polynomTermVariable = 'X';
    private double polynomTermCoefficient;
    private int polynomTermPower;

    public PolynomTerm(double termCoefficient, int termPower) {
        this.polynomTermCoefficient = termCoefficient;
        this.polynomTermPower = termPower;
    }

    public PolynomTerm multiplyPolynomTerms(PolynomTerm polynomTermToMultiply)
     {
        return new PolynomTerm((this.polynomTermCoefficient * polynomTermToMultiply.polynomTermCoefficient),
                (this.polynomTermPower + polynomTermToMultiply.polynomTermPower));
    }

    @Override
    public String toString() {
        return String.format("%.2f*%c^%d",
                polynomTermCoefficient, polynomTermVariable, polynomTermPower);
    }
}
