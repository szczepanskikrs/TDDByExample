package org.tdd;

public enum Currency {
    USD(2),CHF(4.5);
    private double conversionValue;

    Currency(double value) {
        conversionValue = value;
    }

    double getValueCHF(){
        return CHF.conversionValue;
    }

    double getValueUSD(){
        return USD.conversionValue;
    }
}
