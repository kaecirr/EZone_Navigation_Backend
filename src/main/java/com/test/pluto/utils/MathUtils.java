package com.test.pluto.utils;

import java.math.BigDecimal;

/**
 * Math utils
 *
 * @author captain
 */
public class MathUtils {

    /**
     * Get distance
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public static double getDistanceBetweenTwoVertex(double x1, double y1, double x2, double y2) {
        BigDecimal bdX1 = BigDecimal.valueOf(x1);
        BigDecimal bdY1 = BigDecimal.valueOf(y1);
        BigDecimal bdX2 = BigDecimal.valueOf(x2);
        BigDecimal bdY2 = BigDecimal.valueOf(y2);

        return Math.sqrt(Math.pow(bdX1.subtract(bdX2).doubleValue(), 2) + Math.pow(bdY1.subtract(bdY2).doubleValue(), 2));
    }
}
