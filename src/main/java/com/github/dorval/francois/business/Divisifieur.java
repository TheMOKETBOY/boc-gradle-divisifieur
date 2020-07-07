package com.github.dorval.francois.business;

import com.github.dorval.francois.util.Errors;

public class Divisifieur {

    /**
     * @return
     */
    public static int diviser(int dividende, int diviseur){
        if (diviseur == 0) {
            throw new IllegalArgumentException(Errors.DIVISION_PAR_ZERO);
        }
        return dividende/diviseur;
    }
}
