package com.epam.collections.optional.task.a.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sery on 05.04.2019.
 */

public class Polynom {

    private List<PolynomTerm> polynomTerms;

    public void addTermToPolynom(PolynomTerm polynomTerm){
        polynomTerms.add(polynomTerm);
    }

    public Polynom(double ... polynomCoefficients) {
        polynomTerms = new ArrayList<>();
        for (int i = polynomCoefficients.length-1; i >= 0; i--) {
            polynomTerms.add(new PolynomTerm(polynomCoefficients[polynomCoefficients.length-i-1], i));
        }
    }

    public PolynomTerm getPolynomTerm(int polynomTermIndex) {
        return polynomTerms.get(polynomTermIndex);
    }

    public void setPolynomTerm(PolynomTerm polynomTerm, int polynomTermIndex) {
        polynomTerms.add(polynomTermIndex,polynomTerm);
    }

    public int getPolynomLength() {
        return polynomTerms.size();
    }

    @Override
    public String toString() {
        return  polynomTerms.toString();
    }
}
