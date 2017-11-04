package org.tdd.FinancialCalculations;

public enum Currency {
    USD(2, "USD"), CHF(1, "CHF");
    private int conversionValue;
    String currencyMarking;

    Currency(int value, String marking) {
        currencyMarking = marking;
        conversionValue = value;
    }

    public int getValueCHF() {
        return CHF.conversionValue;
    }

    public int getValueUSD() {
        return USD.conversionValue;
    }

}
