package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class InchesToCentimetersConvertor extends UnitConverter {
    @Override
    protected BigDecimal getCoefficient() {
        return new BigDecimal("2.54");
    }
}
