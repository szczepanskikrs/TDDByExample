package org.tdd;

public enum Currency {
    USD(2),CHF(1);
    private int conversionValue;

    Currency(int value) {
        conversionValue = value;
    }

    int getValueCHF(){
        return CHF.conversionValue;
    }

    int getValueUSD(){
        return USD.conversionValue;
    }
}
